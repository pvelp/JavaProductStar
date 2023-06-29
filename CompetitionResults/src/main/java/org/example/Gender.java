package org.example;

import java.util.Objects;
import java.util.stream.Stream;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    final private String code;
    Gender(String code) {
        this.code = code;
    }

    public static Gender of(String code){
        return Stream.of(values())
                .filter(gender -> Objects.equals(gender.code, code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown gender: " + code));
    }
}
