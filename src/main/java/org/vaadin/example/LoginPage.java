package org.vaadin.example;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginPage extends VerticalLayout {
    public LoginPage(){
        //create login form
        LoginForm loginForm = new LoginForm();
        loginForm.addLoginListener(e -> {
            if("user".equals(e.getUsername()) && "password".equals(e.getPassword())){
                Notification.show("Login Successful");
            }
        });

//        Add the login form to the layout
        add(loginForm);

    }
}
