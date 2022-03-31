package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserDetailDTO;
import com.identitycard.demo.entity.UserDetail;

import java.util.List;

public interface UserDetailService {
    UserDetailDTO getById(Long id);
    UserDetailDTO insert(UserDetail userDetail);
    List<UserDetailDTO> getAll();
}
