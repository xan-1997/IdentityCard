package com.identitycard.demo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "user_detail")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "userDetail", cascade = CascadeType.ALL)
    private List<UserPhone> userPhone;

    @Column(nullable = false)
    private String maritalStatus;

    @Column(nullable = false)
    private String militaryService;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable = false)
    private String eyeColor;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String placeOfResidence;

    @Column(nullable = false)
    private String issuingAuthority;

    @Column(nullable = false)
    private Date issueDateCard;

    @Column(nullable = false)
    private Date expirationDateCard;

    public List<UserPhone> getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(List<UserPhone> userPhone) {
        this.userPhone = userPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
