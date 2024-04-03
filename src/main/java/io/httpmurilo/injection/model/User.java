package io.httpmurilo.injection.model;


import javax.persistence.*;

@Entity
public class User {

    public User() {}

    public User(int id, String name, Status isActive, Status isAdmin) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.isAdmin = isAdmin;
    }

    @Id
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status isActive;
    @Enumerated(EnumType.STRING)
    private Status isAdmin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getIsActive() {
        return isActive;
    }

    public void setIsActive(Status isActive) {
        this.isActive = isActive;
    }

    public Status getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Status isAdmin) {
        this.isAdmin = isAdmin;
    }
}