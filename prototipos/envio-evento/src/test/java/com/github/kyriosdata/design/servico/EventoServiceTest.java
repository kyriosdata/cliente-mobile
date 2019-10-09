package com.github.kyriosdata.design.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventoServiceTest {

    @Test
    void conteudoEnviado() {
        Evento er = new RequisicaoEvento(new Requisicao("a", "b"));
        EventoService es = new EventoService();
        assertEquals("[\"a\",\"b\"]", es.envia(er));
    }
}
