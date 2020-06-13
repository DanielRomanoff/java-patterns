package net.daniel.basepatterns.creational.abstractFactory;

import net.daniel.basepatterns.creational.abstractFactory.banking.BankingTeamFactory;
import net.daniel.basepatterns.creational.abstractFactory.team.Developer;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectManager;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectTeamFactory;
import net.daniel.basepatterns.creational.abstractFactory.team.Tester;

public class SuperBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        ProjectManager manager = projectTeamFactory.createProjectManager();

        System.out.println("Creating bank website...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
