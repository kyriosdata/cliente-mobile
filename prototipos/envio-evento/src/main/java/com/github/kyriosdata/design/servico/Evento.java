package com.github.kyriosdata.design.servico;

/**
 * Identifica conteúdo do evento a ser enviado.
 */
public interface Evento {

    /**
     * Retorna o conteúdo (valor) relevante do evento a ser sinalizado.
     *
     * @return Conteúdo a ser sinalizado.
     */
    String conteudo();
}
