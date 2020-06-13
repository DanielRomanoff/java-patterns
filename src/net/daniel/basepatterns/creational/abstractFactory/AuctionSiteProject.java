package net.daniel.basepatterns.creational.abstractFactory;

import net.daniel.basepatterns.creational.abstractFactory.website.WebsiteTeamFactory;
import net.daniel.basepatterns.creational.abstractFactory.team.Developer;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectManager;
import net.daniel.basepatterns.creational.abstractFactory.team.ProjectTeamFactory;
import net.daniel.basepatterns.creational.abstractFactory.team.Tester;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        ProjectManager manager = projectTeamFactory.createProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
