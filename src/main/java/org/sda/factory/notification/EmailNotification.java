package org.sda.factory.notification;

public class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
