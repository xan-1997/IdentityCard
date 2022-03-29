package com.identitycard.demo.mapper;

import com.identitycard.demo.dto.UserDetailDTO;
import com.identitycard.demo.entity.UserDetail;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserDetailMapper {
    UserDetailDTO toUserDetailDTO(UserDetail detail);
    UserDetail toUserDetail(UserDetailDTO detailDTO);
    List<UserDetailDTO> toListUserDetailDTO(List<UserDetail> list);
}
