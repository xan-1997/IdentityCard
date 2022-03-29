package com.identitycard.demo.controller;

import com.identitycard.demo.dto.UserPhoneDTO;
import com.identitycard.demo.entity.UserPhone;
import com.identitycard.demo.service.UserPhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_phone")
@RequiredArgsConstructor
public class UserPhoneController {
    private final UserPhoneService userPhoneService;

    @GetMapping("/{id}")
    public UserPhoneDTO getUserPhoneByID(@PathVariable Long id){
        return userPhoneService.getById(id);
    }

    @PostMapping
    public UserPhoneDTO insertUserPhone(@RequestBody UserPhone userPhone){
        return userPhoneService.insert(userPhone);
    }

    @DeleteMapping("/{id}")
    public String deleteUserPhone(@PathVariable Long id){
        userPhoneService.delete(id);
        return "Successfully deleted!!!";
    }

    @GetMapping("byUserId/{id}")
    public List<UserPhoneDTO> getUserPhones(@PathVariable Long id){
        return userPhoneService.getUserPhonesByUserId(id);
    }

}
