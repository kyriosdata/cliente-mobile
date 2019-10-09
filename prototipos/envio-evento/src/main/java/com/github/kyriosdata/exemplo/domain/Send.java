package com.github.kyriosdata.exemplo.domain;

public class Send implements EnvioStrategy {
    @Override
    public void destino(String destino) {

    }

    @Override
    public void envia(String conteudo) {
        System.out.println("SEND");
    }
}
