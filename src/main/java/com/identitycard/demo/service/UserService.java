package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserDTO;
import com.identitycard.demo.entity.User;

import java.util.List;

public interface UserService {
    UserDTO getById(Long id);
    UserDTO insert(User user);
    List<UserDTO> getAll();
    UserDTO getUserInfoById(Long id);

    UserDTO getSpecialUser(Long id);
}
