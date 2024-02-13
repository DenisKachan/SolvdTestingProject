package com.solvd.testingProject.api.models;

import lombok.Data;

@Data
public class User {

    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private Address address;
    private Company company;
}
