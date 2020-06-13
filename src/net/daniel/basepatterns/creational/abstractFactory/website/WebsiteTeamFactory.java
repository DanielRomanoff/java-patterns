package net.daniel.basepatterns.creational.abstractFactory.website;

import net.daniel.basepatterns.creational.abstractFactory.team.Developer;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectManager;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectTeamFactory;
import net.daniel.basepatterns.creational.abstractFactory.team.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new WebsitePM();
    }
}
