package com.github.kyriosdata.design.servico;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EventoServiceFactory {

    private final String PACKAGE = "com.github.kyriosdata.exemplo.domain.";
    private final String SEND = PACKAGE + "Send";
    private final String STORE_AND_SEND = PACKAGE + "StoreSend";

    EventoService getInstance() {
        EventoService servico = new EventoService();
        for (Field field : servico.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Networking.class)) {
                Annotation anotacao = field.getAnnotation(Networking.class);
                try {
                    Method m = anotacao.getClass().getMethod("disponivel");
                    String valor = m.invoke(anotacao).toString();
                    String clazz = "não".equals(valor) ? STORE_AND_SEND : SEND;
                    Class<?> nome = Class.forName(clazz);
                    Constructor<?> ctor = nome.getConstructor();
                    EnvioStrategy estrategia =
                            (EnvioStrategy) ctor.newInstance();

                    field.setAccessible(true);
                    field.set(servico, estrategia);
                } catch (Exception exc) {
                    throw new RuntimeException("falha", exc.getCause());
                }
            }
        }
        return servico;
    }
}
