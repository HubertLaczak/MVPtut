package com.example.mvptutorial.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User {

    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isValidData() {
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length() > 6;
    }
}
