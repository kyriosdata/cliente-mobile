package com.github.kyriosdata.exemplo.domain;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe que implementa o envio de evento para micro-serviços registrados
 * considerando disponibilidade de acesso ao destinatário ou não.
 */
public class EventoService {

    @Networking()
    private EnvioStrategy send;

    @Networking(disponivel = "não")
    private EnvioStrategy storeAndSend;

    public String envia(final Evento evento) {
        final String conteudo = evento.conteudo();
        EnvioStrategy estrategia = internetDisponivel() ? send : storeAndSend;
        estrategia.envia(conteudo);
        return conteudo;
    }

    private boolean internetDisponivel() {
        return (ThreadLocalRandom.current().nextInt(10) & 1) == 1;
    }
}
