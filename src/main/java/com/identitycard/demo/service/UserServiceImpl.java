package com.identitycard.demo.service;

import com.identitycard.demo.dto.UserDTO;
import com.identitycard.demo.entity.User;
import com.identitycard.demo.entity.UserDetail;
import com.identitycard.demo.entity.UserPhone;
import com.identitycard.demo.mapper.UserMapper;
import com.identitycard.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDTO getById(Long id) {
        Optional<User> result = repository.findById(id);
        User user = result.orElseThrow(()->new NullPointerException("There is no User with this id!!!"));
        System.out.println(user);
        return mapper.toUserDTO(user);
    }

    @Override
    public UserDTO insert(User user) {
        UserDetail detail = user.getUserDetail();
        detail.setUser(user);


        List<UserPhone> userPhone = detail.getUserPhone();
        for (UserPhone phone:userPhone){
            phone.setUserDetail(detail);
        }
        user = repository.save(user);

        UserDTO result = mapper.toUserDTO(user);
//        result.getUserDetail().setUserId(user.getId());
        return result;
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> list = repository.findAll();
        return mapper.toUserDTOS(list);
    }
}
