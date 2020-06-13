package net.daniel.basepatterns.creational.abstractFactory.banking;

import net.daniel.basepatterns.creational.abstractFactory.team.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
