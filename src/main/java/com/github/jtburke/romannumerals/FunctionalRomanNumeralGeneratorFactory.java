package com.github.jtburke.romannumerals;

import java.util.Arrays;

public class FunctionalRomanNumeralGeneratorFactory {
    public static final BiNumeral COUNT_ONE = new BiNumeral("I", 1);
    public static final BiNumeral COUNT_FOUR = new BiNumeral("IV", 4);
    public static final BiNumeral COUNT_FIVE = new BiNumeral("V", 5);
    public static final BiNumeral COUNT_NINE = new BiNumeral("IX", 9);
    public static final BiNumeral COUNT_TEN = new BiNumeral("X", 10);
    public static final BiNumeral COUNT_FORTY = new BiNumeral("XL", 40);
    public static final BiNumeral COUNT_FIFTY = new BiNumeral("L", 50);
    public static final BiNumeral COUNT_NINETY = new BiNumeral("XC", 90);
    public static final BiNumeral COUNT_ONE_HUNDRED = new BiNumeral("C", 100);
    public static final BiNumeral COUNT_FOUR_HUNDRED = new BiNumeral("CD", 400);
    public static final BiNumeral COUNT_FIVE_HUNDRED = new BiNumeral("D", 500);
    public static final BiNumeral COUNT_NINE_HUNDRED = new BiNumeral("CM", 900);
    public static final BiNumeral COUNT_ONE_THOUSAND = new BiNumeral("M", 1000);

    public static final BiNumeral[] COUNT_ALL = new BiNumeral[] {
        COUNT_ONE_THOUSAND, COUNT_NINE_HUNDRED, COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED,
        COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY,
        COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE
    };

    public static RomanNumeralGenerator create(BiNumeral... rules) {
        return new FunctionalRomanNumeralGenerator(Arrays.asList(rules));
    }
}
