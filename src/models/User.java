package models;

import java.io.Serializable;

public class User implements Serializable {
    private final String username;
    private final String password;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isPasswordValid(String password) {
        return this.password.equals(password);
    }
}
