package com.refactoring.Etapa1;

public class ClassificationService  {
    private static final int HIGH_THRESHOLD = 10;
    private static final int RARE_VALUE = -9999;

    private static final String LABEL_HIGH   = "ALTO";
    private static final String LABEL_MEDIUM = "MÉDIO";
    private static final String LABEL_LOW    = "BAIXO";
    private static final String LABEL_RARE   = "CASO RARO";

    public void printClassification(int value) {
        String label = classify(value);
        System.out.println(label);
    }

    protected String classify(int value) {
        if (value == RARE_VALUE) {
            return LABEL_RARE;
        }
        if (value > HIGH_THRESHOLD) {
            return LABEL_HIGH;
        }
        if (value == HIGH_THRESHOLD) {
            return LABEL_MEDIUM;
        }
        return LABEL_LOW;
    }

}
