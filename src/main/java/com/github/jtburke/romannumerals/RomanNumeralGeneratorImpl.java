package com.github.jtburke.romannumerals;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {
    public String generate(int number) {
        String roman = "";

        for (int i = number; i > 0; i--) {
            roman += "I";
        }

        return roman;
    }
}
