package com.github.kyriosdata.design.servico;

import com.google.gson.Gson;

import java.util.Objects;

public class RequisicaoEvento implements Evento {

    private Requisicao encapsulada;

    RequisicaoEvento(Requisicao requisicao) {
        encapsulada = Objects.requireNonNull(requisicao);
    }

    @Override
    public String conteudo() {
        return new Gson().toJson(encapsulada.getPalavras());
    }
}
