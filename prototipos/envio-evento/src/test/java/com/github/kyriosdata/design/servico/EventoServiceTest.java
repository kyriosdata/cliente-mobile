package com.github.kyriosdata.design.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventoServiceTest {

    @Test
    void conteudoEnviado() {
        Evento er = () -> "a saída esperada";
        EventoService es = new EventoService();
        assertEquals("a saída esperada", es.envia(er));
    }
}
