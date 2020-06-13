package net.daniel.basepatterns.structurual.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality){
        Developer developer = developers.get(speciality);

        if (developer == null){
            switch (speciality.toLowerCase()){
                case "java" :
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++" :
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;
                case "php" :
                    System.out.println("Hiring Php developer...");
                    developer = new PhpDeveloper();
                    break;
                case "javascript" :
                    System.out.println("Hiring JavaScript developer...");
                    developer = new JavaScriptDeveloper();
                    break;
                default:
                    throw new RuntimeException(speciality + " is unknown speciality.");
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
