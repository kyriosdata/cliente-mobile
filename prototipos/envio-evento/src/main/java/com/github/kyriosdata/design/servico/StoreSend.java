package com.github.kyriosdata.design.servico;

public class StoreSend implements EnvioStrategy {
    @Override
    public void destino(String destino) {

    }

    @Override
    public String envia(String conteudo) {
        return "STORE AND FORWARD: " + conteudo;
    }
}
