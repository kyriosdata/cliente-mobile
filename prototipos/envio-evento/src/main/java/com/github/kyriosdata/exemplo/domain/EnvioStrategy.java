package com.github.kyriosdata.exemplo.domain;

/**
 * Envio de requisição. Objeto que implementa esta interface deve primeiro
 * receber o destino para o qual o conteúdo será enviado.
 */
public interface EnvioStrategy {

    /**
     * Define destino para envio de requisição
     * @param destino
     */
    void destino(String destino);

    /**
     * Envio do conteúdo para destino.
     *
     * @param conteudo Conteúdo a ser enviado.
     */
    void envia(String conteudo);
}
