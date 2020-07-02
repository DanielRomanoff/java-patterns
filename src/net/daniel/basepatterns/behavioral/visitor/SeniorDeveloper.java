package net.daniel.basepatterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass project) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
