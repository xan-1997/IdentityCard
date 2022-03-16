package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserPhoneDTO;
import com.identitycard.demo.entity.UserPhone;
import org.springframework.stereotype.Service;

@Service
public interface UserPhoneService {
    UserPhone getById(Long id);
    UserPhone insert(UserPhone userPhone);
}
