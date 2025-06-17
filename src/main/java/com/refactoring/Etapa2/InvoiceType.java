package com.refactoring.Etapa2;

public enum InvoiceType {
    SIMPLE(1, "Simples"),
    TAXED(2, "Com imposto"),
    GHOST(-1, "Fantasma"),
    UNKNOWN(0, "Desconhecido");

    private final int code;
    private final String description;

    InvoiceType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static InvoiceType fromCode(int code) {
        for (InvoiceType t : values()) {
            if (t.code == code) {
                return t;
            }
        }
        return UNKNOWN;
    }
}
