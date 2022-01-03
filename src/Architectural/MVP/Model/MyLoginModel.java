package Architectural.MVP.Model;

import Architectural.MVP.Model.LoginModel;

public class MyLoginModel implements LoginModel {
    String user;

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }
}
