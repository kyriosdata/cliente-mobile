package com.github.kyriosdata.design.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EventoServiceFatoryTest {

    @Test
    void quandoNaoHaServicoDeRede() {
        EventoService servico = new EventoServiceFactory().getInstance();
        String enviado = servico.envia(() -> "mensagem");
        assertTrue(enviado.contains("mensagem"));
        assertTrue(enviado.contains("STORE AND FORWARD"));
    }

    @Test
    void quandoHaServicoDeRede() {
        EventoService servico = new EventoServiceFactory().getInstance();
        servico.setFuncaoQueVerificaDisponibilidadeDeRede(() -> true);

        String enviado = servico.envia(() -> "mensagem");
        assertTrue(enviado.contains("mensagem"));
        assertTrue(enviado.contains("SEND"));
    }
}
