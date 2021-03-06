package Architectural.MVP.Presenter;

import Architectural.MVP.View.LoginView;
import Architectural.MVP.Model.LoginModel;

public class MyLoginPresenter implements LoginPresenter {
    LoginModel loginModel;
    LoginView loginView;
    private Runnable onLogin;

    @Override
    public LoginModel getModel() {
        return loginModel;
    }

    @Override
    public void setModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public LoginView getView() {
        return loginView;
    }

    @Override
    public void setView(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public void run() {
        loginModel.setUser("previousUser");
        loginView.setPresenter(this);
        loginView.updateViewFromModel();
        loginView.open();
    }

    @Override
    public void login() {
        loginView.updateModelFromView();
        if (loginModel.getUser().equalsIgnoreCase("root")) {
            loginView.close();
            loginView.setPresenter(null);// for memory sanity.
            onLogin.run();
        } else {
            loginView.userRejected();
        }
    }
}
