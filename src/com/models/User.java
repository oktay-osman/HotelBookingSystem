package com.models;

import com.models.enums.Role;

import java.io.Serializable;

public class User implements Serializable {
    private final String username;
    private final String password;
    private final Role role;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
        this.role = Role.USER;
    }

    public String getUsername() {
        return username;
    }

    public boolean isPasswordValid(String password) {
        return this.password.equals(password);
    }

    public Role getRole () {
        return role;
    }
}
