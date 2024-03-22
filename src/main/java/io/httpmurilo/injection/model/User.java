package io.httpmurilo.injection.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    public User() {}

    @Id
    private int id;
    private String name;
    private boolean isActive;
    private boolean isAdmin;
}
