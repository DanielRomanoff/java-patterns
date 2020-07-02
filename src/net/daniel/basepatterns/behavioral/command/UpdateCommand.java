package net.daniel.basepatterns.behavioral.command;

public class UpdateCommand implements Command {
    private DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
