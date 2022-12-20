package com.abdoa.java8Streams;

import java.util.List;

public class User {

    private String name;
    private String phone;
    private List<String> emailIds;

    public User() {
    }

    public User(String name, String phone, List<String> emailIds) {
        this.name = name;
        this.phone = phone;
        this.emailIds = emailIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getEmailIds() {
        return emailIds;
    }

    public void setEmailIds(List<String> emailIds) {
        this.emailIds = emailIds;
    }
}
