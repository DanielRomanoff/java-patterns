package net.daniel.basepatterns.creational.abstractFactory.banking;

import net.daniel.basepatterns.creational.abstractFactory.team.Developer;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectManager;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectTeamFactory;
import net.daniel.basepatterns.creational.abstractFactory.team.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new BankingPM();
    }
}
