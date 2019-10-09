package com.github.kyriosdata.exemplo.domain;

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
    public String disponivel() default "sim";
}
