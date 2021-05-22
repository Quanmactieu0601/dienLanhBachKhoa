package com.company.dienLanhBachKhoa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String email;
    private String password;
    private String userName;
    private String birthday;
    private boolean isMale;
    private String phone;
    private String address;
    private String imageUrl;
    @Column(nullable = false , updatable = false)
    private String userCode;




    public User(){

    }

    public User(String email, String password , String userName, String birthday,
                boolean isMale, String phone, String address, String imageUrl ){
        this.email = email;
        this.password = password;
        this.userName=userName;
        this.birthday = birthday;
        this.isMale = isMale;
        this.phone = phone;
        this.address =address;
        this.imageUrl = imageUrl;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id +'\''+
                "email='" + email + '\'' +
                "password='" + password + '\'' +
                "userName='" + userName + '\'' +
                "birthday='" + birthday + '\'' +
                "isMale='" + isMale + '\'' +
                "phone='" + phone + '\'' +
                "address='" + address + '\'' +
                "imageUrl='" + imageUrl + '\'' +
                "userCode='" + userCode + '\'' +
                '}';

    }
}