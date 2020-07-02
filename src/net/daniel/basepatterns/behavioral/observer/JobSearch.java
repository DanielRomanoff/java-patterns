package net.daniel.basepatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancy("First Java Position");
        site.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Danil Romanov");
        Observer secondSubscriber = new Subscriber("Yuri Jonson");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Third Java Position");

        site.removeVacancy("First Java Position");
    }
}
