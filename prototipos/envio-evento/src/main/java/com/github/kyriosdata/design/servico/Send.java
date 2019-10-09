package com.github.kyriosdata.design.servico;

public class Send implements EnvioStrategy {
    @Override
    public void destino(String destino) {

    }

    @Override
    public String envia(String conteudo) {
        return "SEND: " + conteudo;
    }
}
