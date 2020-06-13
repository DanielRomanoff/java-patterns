package net.daniel.basepatterns.creational.abstractFactory.website;

import net.daniel.basepatterns.creational.abstractFactory.team.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code");
    }
}
