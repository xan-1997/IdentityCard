package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserPhoneDTO;
import com.identitycard.demo.entity.UserPhone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserPhoneService {
    UserPhoneDTO getById(Long id);
    UserPhoneDTO insert(UserPhone userPhone);
    void delete(Long id);
    List<UserPhoneDTO> getUserPhonesByUserId(Long id);
    List<UserPhoneDTO> getUserPhonesBySeries(String series);

}
