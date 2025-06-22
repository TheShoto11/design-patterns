package org.sda.decorator;

public class BasicNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending basic notification");
    }
}

