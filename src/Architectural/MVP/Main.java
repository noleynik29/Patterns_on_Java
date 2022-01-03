package Architectural.MVP;

import Architectural.MVP.Model.LoginModel;
import Architectural.MVP.Model.MyLoginModel;
import Architectural.MVP.Presenter.LoginPresenter;
import Architectural.MVP.Presenter.MyLoginPresenter;
import Architectural.MVP.View.LoginView;
import Architectural.MVP.View.MyLoginView;

import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                LoginModel loginModel = new MyLoginModel();
                LoginPresenter loginPresenter = new MyLoginPresenter();
                loginPresenter.setModel(loginModel);
                LoginView loginView = new MyLoginView();
                loginPresenter.setView(loginView);
                loginPresenter.setOnLogin(new Runnable() {

                    @Override
                    public void run() {
                        JOptionPane.showMessageDialog(null, "Welcome user!");
                    }
                });
                loginPresenter.run();
            }
        });
    }
}
