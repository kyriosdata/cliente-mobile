package com.github.kyriosdata.design.servico;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indica se serviço de rede está disponível ("sim") ou não disponível ("não").
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Networking {
    String disponivel() default "sim";
}
