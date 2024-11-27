package org.vaadin.example;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("home")
public class HomePage extends VerticalLayout {
    public HomePage(){
//        Add content for the home page

        add(new H1("Home Page"));
        add(new H1("Welcome to Our Home Page"));
    }
}
