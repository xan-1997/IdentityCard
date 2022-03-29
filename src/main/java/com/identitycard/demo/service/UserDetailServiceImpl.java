package com.identitycard.demo.service;

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
    public UserDetail getById(Long id) {
        Optional<UserDetail> result = repository.findById(id);
        return result.orElseThrow(()->new NullPointerException("There is no UserDetail with this id!!!"));
    }

    @Override
    public UserDetail insert(UserDetail userDetail) {
        return repository.save(userDetail);
    }

    @Override
    public List<UserDetail> getAll() {
        return repository.findAll();
    }
}
