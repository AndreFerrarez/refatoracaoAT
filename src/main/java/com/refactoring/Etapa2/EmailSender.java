package com.refactoring.Etapa2;

public class EmailSender {
    public static void send(String email, String content) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + content);
    }
}
