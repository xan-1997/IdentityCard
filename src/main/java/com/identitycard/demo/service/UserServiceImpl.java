package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserDTO;
import com.identitycard.demo.dto.UserPhoneDTO;
import com.identitycard.demo.entity.User;
import com.identitycard.demo.entity.UserDetail;
import com.identitycard.demo.entity.UserPhone;
import com.identitycard.demo.mapper.UserMapper;
import com.identitycard.demo.mapper.UserPhoneMapper;
import com.identitycard.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDTO getById(Long id) {
        Optional<User> result = repository.findById(id);
        User user = result.orElseThrow(() -> new NullPointerException("There is no User with this id!!!"));
        System.out.println(user);
        return mapper.toUserDTO(user);
    }


    private final UserPhoneMapper mapper2;

    @Override
    public UserDTO getSpecialUser(Long id) {
        UserDTO result = new UserDTO();
        User user = repository.getSpecUserById(id);
        result.setFirstName(user.getFirstName());
        result.setLastName(user.getLastName());
        result.setUserPhone(mapper2.toListDTO(user.getUserPhone()));
        return result;
    }

    @Override
    public UserDTO insert(User user) {
        UserDetail detail = user.getUserDetail();
        detail.setUser(user);
        List<UserPhone> phones = user.getUserPhone();
        for (UserPhone phone : phones) {
            phone.setUser(user);
        }
        user = repository.save(user);
        return mapper.toUserDTO(user);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> list = repository.findAll();
        return mapper.toUserDTOS(list);
    }
}
