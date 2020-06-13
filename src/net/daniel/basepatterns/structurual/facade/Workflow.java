package net.daniel.basepatterns.structurual.facade;

public class Workflow {
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();
    private Job job = new Job();

    public void solveProblems(){
        job.doJob();
        bugTracker.isActiveSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
