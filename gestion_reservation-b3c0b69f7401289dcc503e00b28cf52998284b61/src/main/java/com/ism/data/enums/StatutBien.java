package com.ism.data.enums;

public enum StatutBien {
    Disponible("disponible"),
    Reserver("reserver"),
    Archiver("archiver");

    private final String value;

    StatutBien(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
