package com.github.kyriosdata.exemplo.domain;

public class StoreSend implements EnvioStrategy {
    @Override
    public void destino(String destino) {

    }

    @Override
    public void envia(String conteudo) {
        System.out.println("STORE THEN SEND");
    }
}
