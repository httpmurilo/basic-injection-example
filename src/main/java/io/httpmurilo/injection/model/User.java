package io.httpmurilo.injection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    public User() {}

    @Id
    private int id;
    private String name;
    private boolean isActive;
    private boolean isAdmin;
}
