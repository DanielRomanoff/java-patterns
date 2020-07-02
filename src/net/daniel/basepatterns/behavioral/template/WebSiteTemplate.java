package net.daniel.basepatterns.behavioral.template;

public abstract class WebSiteTemplate {
    public final void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
