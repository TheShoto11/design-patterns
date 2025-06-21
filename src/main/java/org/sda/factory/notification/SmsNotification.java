package org.sda.factory.notification;

public class SmsNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Sms: " + message);
    }
}
