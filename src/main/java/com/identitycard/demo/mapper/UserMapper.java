package com.identitycard.demo.mapper;

import com.identitycard.demo.dto.UserDTO;
import com.identitycard.demo.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    UserDTO toUserDTO(User user);
    List<UserDTO> toUserDTOS(List<User> users);
    User toUser(UserDTO userDTO);
}
