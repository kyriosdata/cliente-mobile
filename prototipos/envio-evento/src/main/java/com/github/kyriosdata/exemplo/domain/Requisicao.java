package com.github.kyriosdata.exemplo.domain;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Reúne uma ou mais palavras empregadas em uma busca.
 * As palavras são mantidas na ordem recebida.
 */
public class Requisicao implements Evento {

    private List<String> palavras;

    Requisicao(String palavra, String... demais) {
        Objects.requireNonNull(palavra);

        List<String> demaisEmLista =
                Arrays.stream(demais).collect(Collectors.toList());

        // Acrescenta primeira palavra ao início
        demaisEmLista.add(0, palavra);

        palavras = Collections.unmodifiableList(demaisEmLista);
    }

    @Override
    public String conteudo() {
        return palavras.stream().collect(Collectors.joining(","));
    }
}
