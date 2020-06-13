package net.daniel.basepatterns.structurual.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase{


    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void update() {
        updateObject();
    }
}
