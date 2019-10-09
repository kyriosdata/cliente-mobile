package com.github.kyriosdata.exemplo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void validaConteudo() {
        Requisicao requisicao = new Requisicao("a", "b");
        assertEquals("a,b", requisicao.conteudo());
    }

}
