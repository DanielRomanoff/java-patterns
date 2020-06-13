package net.daniel.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("C++");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
    public static DeveloperFactory createDeveloperBySpeciality(String speciality){
        switch (speciality.toLowerCase()){
            case "java" : return new JavaDeveloperFactory();
            case "c++" : return new CppDeveloperFactory();
            default: throw new RuntimeException(speciality + " is unknown speciality. ");
        }
    }
}
