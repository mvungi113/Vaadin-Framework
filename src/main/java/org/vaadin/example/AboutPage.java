package org.vaadin.example;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("about")
public class AboutPage extends VerticalLayout {
    public AboutPage(){
//        Add content for the about us page
        add(new H1("About Us"));
        add(new H1("We are a company that values innovation."));
        add(new Text("Learn more about our Mission and Vision"));
    }
}
