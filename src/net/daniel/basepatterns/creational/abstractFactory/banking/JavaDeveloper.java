package net.daniel.basepatterns.creational.abstractFactory.banking;

import net.daniel.basepatterns.creational.abstractFactory.team.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
