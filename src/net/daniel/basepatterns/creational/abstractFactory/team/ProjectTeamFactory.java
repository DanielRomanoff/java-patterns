package net.daniel.basepatterns.creational.abstractFactory.team;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    ProjectManager createProjectManager();
}
