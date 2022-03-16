package com.identitycard.demo.dto;


public class UserDTO {
    private Long id;
    private int series;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String placeOfBirth;
    private UserDetailDTO userDetail;

    public UserDTO(Long id, int series, String firstName, String lastName, String fatherName, String placeOfBirth, UserDetailDTO userDetail) {
        this.id = id;
        this.series = series;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.placeOfBirth = placeOfBirth;
        this.userDetail = userDetail;
    }

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", series=" + series +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", userDetail=" + userDetail +
                '}';
    }
}
