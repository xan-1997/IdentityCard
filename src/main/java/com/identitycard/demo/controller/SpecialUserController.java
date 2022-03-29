package com.identitycard.demo.controller;

import com.identitycard.demo.dto.UserDTO;
import com.identitycard.demo.mapper.UserMapper;
import com.identitycard.demo.repository.UserRepository;
import com.identitycard.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/special_controller")
@RequiredArgsConstructor
public class SpecialUserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserDTO getSpecialDTO(@PathVariable Long id){
        return userService.getSpecialUser(id);
    }
}
