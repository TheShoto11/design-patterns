package org.sda.factory.notification;

public class ReminderNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending reminder: " + message);
    }
}
