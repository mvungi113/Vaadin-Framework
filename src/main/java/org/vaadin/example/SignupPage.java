package org.vaadin.example;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.router.Route;


@Route("signup")
public class SignupPage extends VerticalLayout{
    public  SignupPage(){
        // create form component

        TextField nameField = new TextField("Enter Full Name");
        EmailField emailField = new EmailField("Enter Email Address");
        PasswordField passwordField = new PasswordField("Enter Strong Password");
        PasswordField confirmPasswordField = new PasswordField("Confirm Password");


        // add checkbox to accept terms and conditions
        Checkbox termsCheckbox = new Checkbox("I agree to the terms and Conditions");

        // button to submit the form
        Button signupButton = new Button("Sign Up", e -> {
//            validate fields before submitting
            if(nameField.getValue().isEmpty()){
                Notification.show("Name is required");
            }else if(emailField.getValue().isEmpty()){
                Notification.show("Email is required");
            }else if(passwordField.getValue().isEmpty()){
                Notification.show("Password is required");
            }else if(!passwordField.getValue().equals(confirmPasswordField.getValue())){
                Notification.show("Password do not match.");
            }else if(!termsCheckbox.getValue()){
                Notification.show("You must accept the terms and conditions");
            }else{
                //Add Logic to save or process the user registration
                Notification.show("Sign Up Successful.");
            }
        });

//        Arrange components in a form layout
        FormLayout formLayout = new FormLayout(nameField,emailField,passwordField,confirmPasswordField,termsCheckbox,signupButton);

        //add the form to the layout
        add(formLayout);
    }
}