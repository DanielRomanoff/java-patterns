package net.daniel.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifiedObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifiedObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifiedObservers() {
        for (Observer o: subscribers) {
            o.handleEvent(this.vacancies);
        }
    }
}
