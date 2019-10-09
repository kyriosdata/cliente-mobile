package com.github.kyriosdata.design.servico;

import java.util.Objects;
import java.util.function.BooleanSupplier;

/**
 * Classe que implementa o envio de evento para micro-serviços registrados
 * considerando disponibilidade de acesso ao destinatário ou não.
 */
public class EventoService {

    @Networking()
    private EnvioStrategy send;

    @Networking(disponivel = "não")
    private EnvioStrategy storeAndSend;

    /**
     * Serviço que verifica se há conexão com a internet.
     */
    private BooleanSupplier rede = () -> false;

    /**
     * Motivada por: (a) isolar estratégia de verificação de disponibilidade
     * de rede e (b) facilitar testes.
     *
     * @param servico Serviço a ser empregado para verificar disponibilidade
     *                de acesso a serviços remotos.
     *
     * @throws NullPointerException Se o serviço fornecido for {@code null}.
     */
    void setFuncaoQueVerificaDisponibilidadeDeRede(BooleanSupplier servico) {
        rede = Objects.requireNonNull(servico);
    }

    public String envia(final Evento evento) {
        EnvioStrategy estrategia = rede.getAsBoolean() ? send : storeAndSend;
        return estrategia.envia(evento.conteudo());
    }
}
