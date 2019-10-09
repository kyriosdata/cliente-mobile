package com.github.kyriosdata.exemplo.domain;

/**
 * Classe que implementa o envio de evento para micro-serviços registrados
 * considerando disponibilidade de acesso ao destinatário ou não.
 */
public class EventoService {

    @Networking(disponivel = "sim")
    private EnvioStrategy sendRequest;

    @Networking(disponivel = "não")
    private EnvioStrategy storeAndForward;

    public String envia(final Evento evento) {
        return evento.conteudo();
    }
}
