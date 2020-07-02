package net.daniel.basepatterns.behavioral.chain;

public class SimpleNotifier extends Notifier{

    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
