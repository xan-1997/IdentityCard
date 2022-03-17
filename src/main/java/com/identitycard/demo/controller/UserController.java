package com.identitycard.demo.controller;

import com.identitycard.demo.dto.UserDTO;
import com.identitycard.demo.entity.User;
import com.identitycard.demo.service.UserDetailService;
import com.identitycard.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserDetailService userDetailService;

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public UserDTO addUser(@Valid @RequestBody User user) {

        return userService.insert(user);
    }

}
