package net.daniel.basepatterns.structurual.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
