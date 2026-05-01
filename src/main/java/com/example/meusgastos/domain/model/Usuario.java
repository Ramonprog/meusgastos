package com.example.meusgastos.domain.model;

import java.util.Date;
import java.util.List;

public class Usuario {

    private Long id;
    private String name;
    private String email;
    private String photoUrl;
    private Date CreatedAt;
    private Date disabledData;
    private List<Titles> titles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getDisabledData() {
        return disabledData;
    }

    public void setDisabledData(Date disabledData) {
        this.disabledData = disabledData;
    }

    public List<Titles> getTitles() {
        return titles;
    }

    public void setTitles(List<Titles> titles) {
        this.titles = titles;
    }

}
