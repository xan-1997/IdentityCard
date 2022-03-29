package com.identitycard.demo.dto;


import com.identitycard.demo.enums.Gender;

import java.sql.Date;

public class UserDetailDTO {
    private Long id;
    private String maritalStatus;
    private String militaryService;
    private String bloodGroup;
    private String eyeColor;
    private Gender gender;
    private String placeOfResidence;
    private String issuingAuthority;
    private Date issueDateCard;
    private Date expirationDateCard;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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
