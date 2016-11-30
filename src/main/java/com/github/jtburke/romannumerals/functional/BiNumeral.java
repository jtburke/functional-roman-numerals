package com.github.jtburke.romannumerals.functional;

public class BiNumeral {
    private final String roman;
    private final Integer decimal;

    public BiNumeral(String roman, Integer decimal) {
        this.roman = roman;
        this.decimal = decimal;
    }

    public String getRoman() {
        return roman;
    }

    public Integer getDecimal() {
        return decimal;
    }
}
