package com.refactoring.Etapa2;

public class Invoice {
    private String clientName;
    private String clientEmail;
    private double amount;
    private InvoiceType type;

    public Invoice(String clientName, String clientEmail, double amount, int typeCode) {
        this.clientName  = clientName;
        this.clientEmail = clientEmail;
        this.amount      = amount;
        this.type        = InvoiceType.fromCode(typeCode);
    }

    public void process() {
        if (!isValidEmail()) {
            System.out.println("Email inválido. Falha no envio.");
            return;
        }

        printHeader();
        printTypeInfo();
        printBody();
        sendInvoiceByEmail();
    }

    private boolean isValidEmail() {
        return clientEmail != null && clientEmail.contains("@");
    }

    private void printHeader() {
        System.out.println("--- NOTA FISCAL ---");
    }

    private void printTypeInfo() {
        System.out.println("Nota fiscal: " + type.getDescription());
    }

    private void printBody() {
        System.out.println("Cliente: " + clientName);
        System.out.println("Valor: R$ " + amount);
    }

    private void sendInvoiceByEmail() {
        System.out.println("---------------------");
        System.out.println("Enviando nota fiscal para: " + clientEmail);
        String nota = buildInvoiceString();
        EmailSender.send(clientEmail, nota);
    }

    private String buildInvoiceString() {
        return String.join("\n",
                "--- NOTA FISCAL ---",
                "Cliente: " + clientName,
                "Valor: R$ " + amount,
                "Tipo: " + type.getDescription(),
                "---------------------"
        );
    }
}
