package com.github.kyriosdata.exemplo.domain;

import com.google.gson.Gson;

public class RequisicaoEvento implements Evento<Requisicao> {

    @Override
    public String conteudo(Requisicao requisicao) {
        return new Gson().toJson(requisicao.getPalavras());
    }
}
