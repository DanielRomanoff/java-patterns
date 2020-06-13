package net.daniel.basepatterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Main project", "Sourcecode sc = new SourceCode();");

        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);

        System.out.println("=====================================");
        Project masterClone1 = projectFactory.cloneProject();
        masterClone1.setSourceCode("");
        System.out.println(masterClone1);


        System.out.println("=====================================");
        Project masterClone2 = projectFactory.cloneProject();
        masterClone2.setSourceCode("cout << \"Hi, GitHub!\"");
        System.out.println(masterClone2);

        System.out.println("=====================================");
        System.out.println(master);
    }
}
