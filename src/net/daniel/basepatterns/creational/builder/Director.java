package net.daniel.basepatterns.creational.builder;

public class Director {
    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildPrice();
        builder.buildCms();

        WebSite webSite = builder.getWebSite();

        return webSite;
    }
}
