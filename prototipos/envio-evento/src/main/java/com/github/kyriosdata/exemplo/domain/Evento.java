package com.github.kyriosdata.exemplo.domain;

/**
 * Identifica conteúdo do evento a ser enviado.
 */
public interface Evento<T> {

    /**
     * Retorna o conteúdo (valor) relevante do evento a ser sinalizado.
     *
     * @param objeto Objeto do qual o conteúdo correspondente será
     *               sinalizado.
     * @return Conteúdo a ser sinalizado.
     */
    String conteudo(T objeto);
}
