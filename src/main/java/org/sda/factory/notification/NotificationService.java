package org.sda.factory.notification;

public class NotificationService {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.getNotification(NotificationType.EMAIL);
        n1.sendMessage("Regarding payments");

        Notification n2 = NotificationFactory.getNotification(NotificationType.PUSH);
        n2.sendMessage("Town hall upgraded to level 11");

        Notification n3 = NotificationFactory.getNotification(NotificationType.SMS);
        n3.sendMessage("Oferta juaj ka mbaruar");
    }
}
