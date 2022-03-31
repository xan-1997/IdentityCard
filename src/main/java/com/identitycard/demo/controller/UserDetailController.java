package com.identitycard.demo.controller;

import com.identitycard.demo.dto.UserDetailDTO;
import com.identitycard.demo.entity.UserDetail;
import com.identitycard.demo.mapper.UserDetailMapper;
import com.identitycard.demo.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user_detail")
@RequiredArgsConstructor
public class UserDetailController {
    private final UserDetailService userDetailService;
    private final UserDetailMapper mapper;

    @GetMapping("/{id}")
    public UserDetailDTO getById(@PathVariable Long id){
        UserDetailDTO userDetail = userDetailService.getById(id);
        return userDetail;
    }
}
