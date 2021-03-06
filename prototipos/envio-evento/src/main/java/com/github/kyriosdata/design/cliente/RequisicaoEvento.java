package com.github.kyriosdata.design.cliente;

import com.github.kyriosdata.design.servico.Evento;
import com.google.gson.Gson;

import java.util.Objects;

class RequisicaoEvento implements Evento {

    private Requisicao encapsulada;

    RequisicaoEvento(Requisicao requisicao) {
        encapsulada = Objects.requireNonNull(requisicao);
    }

    @Override
    public String conteudo() {
        return new Gson().toJson(encapsulada.getPalavras());
    }
}
