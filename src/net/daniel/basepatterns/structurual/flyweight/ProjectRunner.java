package net.daniel.basepatterns.structurual.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("C++"));
        developers.add(developerFactory.getDeveloperBySpeciality("C++"));
        developers.add(developerFactory.getDeveloperBySpeciality("C++"));
        developers.add(developerFactory.getDeveloperBySpeciality("Php"));
        developers.add(developerFactory.getDeveloperBySpeciality("Php"));
        developers.add(developerFactory.getDeveloperBySpeciality("Php"));
        developers.add(developerFactory.getDeveloperBySpeciality("JavaScript"));
        developers.add(developerFactory.getDeveloperBySpeciality("JavaScript"));
        developers.add(developerFactory.getDeveloperBySpeciality("JavaScript"));

        for (int i = 1; i < developers.size(); i++){
            System.out.print(i + " - ");
            developers.get(i).writeCode();
        }
    }
}
