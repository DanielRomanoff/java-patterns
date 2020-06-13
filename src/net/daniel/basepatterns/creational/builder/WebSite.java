package net.daniel.basepatterns.creational.builder;

public class WebSite {
    protected String name;
    protected int price;
    protected Cms cms;

    @Override
    public String toString() {
        return "WebSite[" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cms=" + cms +
                ']';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }
}
