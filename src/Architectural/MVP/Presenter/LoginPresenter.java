package Architectural.MVP.Presenter;

import Architectural.MVP.View.LoginView;
import Architectural.MVP.Model.LoginModel;

public interface LoginPresenter {
    LoginModel getModel();

    void setModel(LoginModel loginModel);

    LoginView getView();

    void setView(LoginView loginView);

    void setOnLogin(Runnable onLogin);

    void run();

    void login();

}
