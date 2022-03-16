package com.identitycard.demo.dto;


import java.sql.Date;
import java.util.List;

public class UserDetailDTO {
    private Long id;
    private Long userId;
    private String maritalStatus;
    private String militaryService;
    private String bloodGroup;
    private String eyeColor;
    private String gender;
    private String placeOfResidence;
    private String issuingAuthority;
    private Date issueDateCard;
    private Date expirationDateCard;
    private List<UserPhoneDTO> userPhone;

    public List<UserPhoneDTO> getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(List<UserPhoneDTO> userPhone) {
        this.userPhone = userPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMilitaryService() {
        return militaryService;
    }

    public void setMilitaryService(String militaryService) {
        this.militaryService = militaryService;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public Date getIssueDateCard() {
        return issueDateCard;
    }

    public void setIssueDateCard(Date issueDateCard) {
        this.issueDateCard = issueDateCard;
    }

    public Date getExpirationDateCard() {
        return expirationDateCard;
    }

    public void setExpirationDateCard(Date expirationDateCard) {
        this.expirationDateCard = expirationDateCard;
    }
}
