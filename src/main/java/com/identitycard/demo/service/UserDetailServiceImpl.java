package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserDetailDTO;
import com.identitycard.demo.entity.UserDetail;
import com.identitycard.demo.mapper.UserDetailMapper;
import com.identitycard.demo.repository.UserDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailService{

    private final UserDetailRepository repository;
    private final UserDetailMapper mapper;

    @Override
    public UserDetailDTO getById(Long id) {
        Optional<UserDetail> userDetail = repository.findById(id);
        UserDetail result = userDetail.orElseThrow(()->new NullPointerException("There is no UserDetail with this id!!!"));
        return mapper.toUserDetailDTO(result);
    }

    @Override
    public UserDetailDTO insert(UserDetail userDetail) {
        return mapper.toUserDetailDTO(repository.save(userDetail));
    }

    @Override
    public List<UserDetailDTO> getAll() {
        return mapper.toListUserDetailDTO(repository.findAll());
    }
}
