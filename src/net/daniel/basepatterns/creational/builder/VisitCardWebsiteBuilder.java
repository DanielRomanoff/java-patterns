package net.daniel.basepatterns.creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
