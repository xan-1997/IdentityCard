package com.identitycard.demo.mapper;

import com.identitycard.demo.dto.UserPhoneDTO;
import com.identitycard.demo.entity.UserPhone;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserPhoneMapper {
    UserPhoneDTO toUserPhoneDTO(UserPhone userPhone);
    UserPhone toUserPhone(UserPhoneDTO userPhoneDTO);
    List<UserPhoneDTO> toListDTO(List<UserPhone> list);
}
