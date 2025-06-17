package com.refactoring.Etapa1;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassificationServiceTest extends TestCase {

    private ClassificationService service;

    @BeforeEach
    void setup() {
        service = new ClassificationService();
    }

    @Test
    void quandoValorMaiorQueLimite_entaoAlto() {
        assertEquals("ALTO", service.classify(11));
    }

    @Test
    void quandoValorIgualLimite_entaoMedio() {
        assertEquals("MÉDIO", service.classify(10));
    }

    @Test
    void quandoValorMenorQueLimite_entaoBaixo() {
        assertEquals("BAIXO", service.classify(5));
    }

    @Test
    void quandoValorCasoRaro_entaoCasoRaro() {
        assertEquals("CASO RARO", service.classify(-9999));
    }
}