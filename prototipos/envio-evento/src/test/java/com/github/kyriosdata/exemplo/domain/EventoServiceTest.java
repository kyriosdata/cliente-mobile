package com.github.kyriosdata.exemplo.domain;

import org.junit.jupiter.api.Test;

class EventoServiceTest {

    @Test
    void conteudoEnviado() {
        Evento er = new RequisicaoEvento(new Requisicao("a", "b"));
        EventoService es = new EventoService();
        es.envia(er);
    }
}
