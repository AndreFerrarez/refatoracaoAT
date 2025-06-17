package com.refactoring.Etapa5;

import java.util.HashMap;
import java.util.Map;

public class NotificationService {

    private final Map<String, Notifier> notifiers = new HashMap<>();

    public NotificationService() {
        notifiers.put("EMAIL", new EmailNotifier());
        notifiers.put("SMS",   new SmsNotifier());
        notifiers.put("PUSH",  new PushNotifier());
    }

    public void notifyUser(String channel, String message) {
        Notifier notifier = notifiers.get(channel);
        if (notifier == null) {
            throw new IllegalArgumentException(
                    "Canal de notificação não suportado: " + channel
            );
        }
        notifier.send(message);
    }
}
