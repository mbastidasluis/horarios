package com.cpu.sistema_horario_java.util.exception;

public enum ExceptionType {
    ENTITY_NOT_FOUND("not.found"), DUPLICATE_ENTITY("duplicate"), ENTITY_EXCEPTION("exception");

    String value;

    ExceptionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}