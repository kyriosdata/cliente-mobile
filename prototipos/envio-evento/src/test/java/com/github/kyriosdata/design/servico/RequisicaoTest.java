package com.github.kyriosdata.design.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RequisicaoTest {

    @Test
    void peloMenosUmaPalavra() {
        assertThrows(NullPointerException.class, () -> new Requisicao(null));
    }

    @Test
    void umaPalavra() {
        assertDoesNotThrow(() -> new Requisicao("a"));
    }
}
