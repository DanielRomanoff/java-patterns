package net.daniel.basepatterns.behavioral.command;

public class DataBase {
    public void insert(){
        System.out.println("Inserting in database...");
    }
    public void update(){
        System.out.println("Updating database...");
    }
    public void select(){
        System.out.println("Recording in database...");
    }
    public void delete(){
        System.out.println("Delete from database...");
    }
}
