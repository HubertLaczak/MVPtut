package com.example.mvptutorial.Presenter;

import com.example.mvptutorial.Model.User;
import com.example.mvptutorial.View.ILoginView;

public class LoginPresenter  {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }


    public void onLogin(String email, String password) {
        User user = new User(email, password);
        boolean isLoginSuccess = user.isValidData();
        if (isLoginSuccess)
            loginView.onLoginResult("Login Success");
        else
            loginView.onLoginResult("Login error");
    }
}
