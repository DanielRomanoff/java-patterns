package net.daniel.basepatterns.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        simpleNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        simpleNotifier.notifyManager("Houston, we`ve got a problem!!!", Priority.ASAP);
    }
}
