package net.daniel.basepatterns.creational.abstractFactory.banking;

import net.daniel.basepatterns.creational.abstractFactory.team.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking");
    }
}
