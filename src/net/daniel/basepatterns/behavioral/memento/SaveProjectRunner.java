package net.daniel.basepatterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("1.0");

        System.out.println(project);

        System.out.println("Saving current version to GitHub...");
        gitHubRepo.setSave(project.save());

        System.out.println("Updating project to version 1.1");
        System.out.println("Adding new bugs..");
        Thread.sleep(5000);

        project.setVersionAndDate("1.1");

        System.out.println(project);

        System.out.println("Something went wrong :(");
        System.out.println("Rolling back to version 1.0");

        project.load(gitHubRepo.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}