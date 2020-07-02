package net.daniel.basepatterns.behavioral.command;

public class InsertCommand implements Command {
    private DataBase dataBase;

    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
