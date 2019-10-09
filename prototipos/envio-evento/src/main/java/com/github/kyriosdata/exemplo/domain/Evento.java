package com.github.kyriosdata.exemplo.domain;

/**
 * Identifica conteúdo do evento a ser enviado.
 */
public interface Evento {

    /**
     * Retorna o conteúdo (valor) relevante do evento a ser sinalizado.
     *
     * @return Conteúdo a ser sinalizado pela ocorrência de um evento.
     */
    String conteudo();
}
