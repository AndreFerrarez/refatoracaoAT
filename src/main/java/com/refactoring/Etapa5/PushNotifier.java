package com.refactoring.Etapa5;

public class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
