package net.daniel.basepatterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
