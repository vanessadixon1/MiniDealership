package com.amcsoftware;

public enum EngineType {

    PETROL("petrol"),
    ELECTRIC("electric");

    public final String name;

    EngineType(String name) {
        this.name = name;
    }
}
