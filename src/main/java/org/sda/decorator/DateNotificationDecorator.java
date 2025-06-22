package org.sda.decorator;

import java.time.LocalDateTime;
import java.util.Date;

public class DateNotificationDecorator implements Notification{

    private Notification wrappee;

    public DateNotificationDecorator(Notification wrappee){
        this.wrappee = wrappee;
    }

    @Override
    public void send() {
        System.out.print(LocalDateTime.now() + ": ");
        wrappee.send();
    }

    public static void main(String[] args) {
        Notification notification = new DateNotificationDecorator(new BasicNotification());
        notification.send();
    }
}
