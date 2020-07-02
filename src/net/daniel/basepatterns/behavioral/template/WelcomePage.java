package net.daniel.basepatterns.behavioral.template;

public class WelcomePage extends WebSiteTemplate{
    @Override
    public void showPageContent() {
        System.out.println("Welcome!");
    }
}
