package io.httpmurilo.injection.model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class User {

    public User() {}

    @Id
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status isActive;
    @Enumerated(EnumType.STRING)
    private Status isAdmin;
}