package com.identitycard.demo.service;

import com.identitycard.demo.entity.UserPhone;
import com.identitycard.demo.repository.UserPhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserPhoneServiceImpl implements UserPhoneService{

    private final UserPhoneRepository repository;

    @Override
    public UserPhone getById(Long id) {
        UserPhone result  = repository.findById(id).orElseThrow(()->new NullPointerException("There is no phone with this id!!!"));
        return result;
    }

    @Override
    public UserPhone insert(UserPhone userPhone) {
        return repository.save(userPhone);
    }
}
