package com.github.kyriosdata.design.servico;

/**
 * Envio de requisição. Objeto que implementa esta interface deve primeiro
 * receber o destino para o qual o conteúdo será enviado.
 */
interface EnvioStrategy {

    /**
     * Define destino para envio de requisição
     * @param destino
     */
    void destino(String destino);

    /**
     * Envio do conteúdo para destino.
     *
     * @param conteudo Conteúdo a ser enviado.
     * @return O conteúdo enviado.
     */
    String envia(String conteudo);
}
