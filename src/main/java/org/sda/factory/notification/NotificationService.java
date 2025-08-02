package org.sda.factory.notification;

public class NotificationService {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.getNotification(NotificationType.EMAIL);
        n1.sendMessage("Regarding payments");
    }
}
