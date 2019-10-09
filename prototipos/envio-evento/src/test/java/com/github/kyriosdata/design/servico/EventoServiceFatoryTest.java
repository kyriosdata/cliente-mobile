package com.github.kyriosdata.design.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EventoServiceFatoryTest {

    @Test
    void experimento() {
        EventoService servico = new EventoServiceFactory().getInstance();
        String enviado = servico.envia(() -> "mensagem");
        assertTrue(enviado.contains("mensagem"));
        assertTrue(enviado.contains("STORE AND FORWARD"));
    }
}
