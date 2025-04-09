package com.ism.data.enums;

public enum TypeBien {
    Appartement("appartement"),
    Maison("maison"),
    Studio("studio");

    private final String value;

    TypeBien(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
