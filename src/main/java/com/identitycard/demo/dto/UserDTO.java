package com.identitycard.demo.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.identitycard.demo.enums.Role;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private Long id;
    private String series;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String placeOfBirth;
    private UserDetailDTO userDetail;
    private Role role;
    private List<UserPhoneDTO> userPhone;

    public List<UserPhoneDTO> getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(List<UserPhoneDTO> userPhone) {
        this.userPhone = userPhone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public UserDetailDTO getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetailDTO userDetail) {
        this.userDetail = userDetail;
    }

}
