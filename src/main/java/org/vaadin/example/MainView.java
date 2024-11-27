package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends AppLayout{

    public MainView(){

        //create the navigation menu
        HorizontalLayout navbar = createNavbar();

//        set the main content of the layout (home page)
        setContent(createHomePage());
    }
    private HorizontalLayout createNavbar(){
        HorizontalLayout navbar = new HorizontalLayout();
        navbar.setWidthFull();
        navbar.addClassName("navbar");

//        create buttons for navigation
        Button homeButton = new Button("Home", e -> navigateTo("home"));
        Button aboutButton = new Button("About us", e -> navigateTo("about"));
        Button loginButton = new Button("Login", e -> navigateTo("login"));

        return navbar;
    }

    private VerticalLayout createHomePage(){
        VerticalLayout homePage = new VerticalLayout();
        var dashboard = new HomePage();
        homePage.add(dashboard);
        homePage.add(new Button("Learn more", e -> navigateTo("about")));
        homePage.add(new Button("Login", e -> navigateTo("login")));
        homePage.add(new Button("Register", e -> navigateTo("signup")));
        homePage.add(new Button("Learn more", e -> navigateTo("about")));
        return homePage;
    }
    private void navigateTo(String page){
        UI.getCurrent().navigate(page);
    }
}