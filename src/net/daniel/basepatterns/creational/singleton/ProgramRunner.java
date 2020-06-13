package net.daniel.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        //looks at hashCode
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString() + "\n");

        ProgramLogger.getProgramLogger().addLogInfo("First log");
        ProgramLogger.getProgramLogger().showLogFile();

        ProgramLogger.getProgramLogger().addLogInfo("Second log");
        ProgramLogger.getProgramLogger().showLogFile();

        ProgramLogger.getProgramLogger().addLogInfo("Third log");
        ProgramLogger.getProgramLogger().showLogFile();

    }
}
