package com.github.jtburke.romannumerals.functional;

public class FunctionalRomanNumeralRule {
    private final String roman;
    private final Integer decimal;

    public FunctionalRomanNumeralRule(String roman, Integer decimal) {
        this.roman = roman;
        this.decimal = decimal;
    }

    public String getRoman() {
        return roman;
    }

    public Integer getDecimal() {
        return decimal;
    }

    public boolean appliesTo(BiNumeral numeral) {
        return numeral.getDecimal() >= decimal;
    }
}
