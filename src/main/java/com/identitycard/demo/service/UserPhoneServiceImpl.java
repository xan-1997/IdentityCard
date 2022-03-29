package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserPhoneDTO;
import com.identitycard.demo.entity.UserPhone;
import com.identitycard.demo.mapper.UserPhoneMapper;
import com.identitycard.demo.repository.UserPhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserPhoneServiceImpl implements UserPhoneService{

    private final UserPhoneRepository repository;
    private final UserPhoneMapper mapper;

    @Override
    public UserPhoneDTO getById(Long id) {
        UserPhone result  = repository.findById(id).orElseThrow(()->new NullPointerException("There is no phone with this id!!!"));
        return mapper.toUserPhoneDTO(result);
    }

    @Override
    public UserPhoneDTO insert(UserPhone userPhone) {
        return mapper.toUserPhoneDTO(repository.save(userPhone));
    }


    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<UserPhoneDTO> getUserPhonesByUserId(Long id) {
        return mapper.toListDTO(repository.getUserPhonesByUserId(id));
    }

    @Override
    public List<UserPhoneDTO> getUserPhonesBySeries(String series) {
        return null;
    }
}
