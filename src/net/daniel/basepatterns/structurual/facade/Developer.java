package net.daniel.basepatterns.structurual.facade;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solve the problem...");
        }
        else{
            System.out.println("Developer is learn some code...");
        }
    }
}
