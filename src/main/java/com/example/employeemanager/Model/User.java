package com.example.employeemanager.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    Long id;
    String first_name;

    public Long getId() {
        return id;
    }

    public User(Long id, String first_name, String email, String last_name, LocalDateTime creation_date, String profile_image_link, LocalDateTime birth_date, String password) {
        this.id = id;
        this.first_name = first_name;
        this.email = email;
        this.last_name = last_name;
        this.creation_date = creation_date;
        this.profile_image_link = profile_image_link;
        this.birth_date = birth_date;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDateTime getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDateTime creation_date) {
        this.creation_date = creation_date;
    }

    public String getProfile_image_link() {
        return profile_image_link;
    }

    public void setProfile_image_link(String profile_image_link) {
        this.profile_image_link = profile_image_link;
    }

    public LocalDateTime getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDateTime birth_date) {
        this.birth_date = birth_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String email;
    String last_name;
    LocalDateTime creation_date;
    String profile_image_link;
    LocalDateTime birth_date;
    enum gender{
        MALE,
        FEMALE
    };
    String password;

    public User() {
    }

    public User(String first_name, String email, String last_name, LocalDateTime creation_date, String profile_image_link, LocalDateTime birth_date, String password) {
        this.first_name = first_name;
        this.email = email;
        this.last_name = last_name;
        this.creation_date = creation_date;
        this.profile_image_link = profile_image_link;
        this.birth_date = birth_date;
        this.password = password;
    }
}
