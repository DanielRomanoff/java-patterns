package net.daniel.basepatterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());
        WebSite webSite = director.buildWebsite();

        System.out.println(webSite);
    }
}
