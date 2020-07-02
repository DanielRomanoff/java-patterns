package net.daniel.basepatterns.behavioral.visitor;

public interface Developer {
    void create(ProjectClass project);

    void create(DataBase dataBase);

    void create(Test test);
}
