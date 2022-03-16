package com.identitycard.demo.service;

import com.identitycard.demo.entity.UserDetail;

import java.util.List;

public interface UserDetailService {
    UserDetail getById(Long id);
    UserDetail insert(UserDetail userDetail);
    List<UserDetail> getAll();
}
