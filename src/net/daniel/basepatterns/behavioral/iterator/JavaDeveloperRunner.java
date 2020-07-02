package net.daniel.basepatterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String [] skills = {"Java", "Spring", "Hibernate", "Maven", "SQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Daniil Romanov", skills);
        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.name);
        System.out.print("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
