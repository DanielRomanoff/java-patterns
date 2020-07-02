package net.daniel.basepatterns.behavioral.strategy;

import net.daniel.basepatterns.behavioral.state.Activity;

public class Sleeping implements Activity {
    @Override
    public void JustDoIt() {
        System.out.println("Sleeping...");
    }
}
