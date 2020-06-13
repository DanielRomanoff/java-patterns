package net.daniel.basepatterns.creational.abstractFactory.website;

import net.daniel.basepatterns.creational.abstractFactory.team.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
