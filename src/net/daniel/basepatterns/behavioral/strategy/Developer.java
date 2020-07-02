package net.daniel.basepatterns.behavioral.strategy;

import net.daniel.basepatterns.behavioral.state.Activity;
import net.daniel.basepatterns.behavioral.state.Coding;
import net.daniel.basepatterns.behavioral.state.Reading;
import net.daniel.basepatterns.behavioral.state.Sleeping;
import net.daniel.basepatterns.behavioral.state.Training;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.JustDoIt();
    }
}
