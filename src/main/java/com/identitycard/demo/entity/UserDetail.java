package com.identitycard.demo.entity;

import com.identitycard.demo.enums.Gender;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user_detail")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name="id")
    private User user;

    @Column(nullable = false)
    private String maritalStatus;

    @Column(nullable = false)
    private String militaryService;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable = false)
    private String eyeColor;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private String placeOfResidence;

    @Column(nullable = false)
    private String issuingAuthority;

    @Column(nullable = false)
    private Date issueDateCard;

    @Column(nullable = false)
    private Date expirationDateCard;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
