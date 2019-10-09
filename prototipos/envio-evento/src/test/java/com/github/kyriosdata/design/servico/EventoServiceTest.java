package com.github.kyriosdata.design.servico;

import com.github.kyriosdata.design.cliente.Requisicao;
import com.github.kyriosdata.design.cliente.RequisicaoEvento;
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
