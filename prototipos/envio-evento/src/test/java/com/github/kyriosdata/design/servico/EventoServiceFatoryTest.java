package com.github.kyriosdata.design.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventoServiceFatoryTest {

    @Test
    void experimento() {
        EventoService servico = new EventoServiceFactory().getInstance();
        assertEquals("teste", servico.envia(() -> "teste"));
    }
}
