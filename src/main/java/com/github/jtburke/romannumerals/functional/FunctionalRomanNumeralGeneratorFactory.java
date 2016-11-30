package com.github.jtburke.romannumerals.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionalRomanNumeralGeneratorFactory {
    public static final FunctionalRomanNumeralRule COUNT_ONE = new FunctionalRomanNumeralRule("I", 1);
    public static final FunctionalRomanNumeralRule COUNT_FOUR = new FunctionalRomanNumeralRule("IV", 4);
    public static final FunctionalRomanNumeralRule COUNT_FIVE = new FunctionalRomanNumeralRule("V", 5);
    public static final FunctionalRomanNumeralRule COUNT_NINE = new FunctionalRomanNumeralRule("IX", 9);
    public static final FunctionalRomanNumeralRule COUNT_TEN = new FunctionalRomanNumeralRule("X", 10);
    public static final FunctionalRomanNumeralRule COUNT_FORTY = new FunctionalRomanNumeralRule("XL", 40);
    public static final FunctionalRomanNumeralRule COUNT_FIFTY = new FunctionalRomanNumeralRule("L", 50);
    public static final FunctionalRomanNumeralRule COUNT_NINETY = new FunctionalRomanNumeralRule("XC", 90);
    public static final FunctionalRomanNumeralRule COUNT_ONE_HUNDRED = new FunctionalRomanNumeralRule("C", 100);
    public static final FunctionalRomanNumeralRule COUNT_FOUR_HUNDRED = new FunctionalRomanNumeralRule("CD", 400);
    public static final FunctionalRomanNumeralRule COUNT_FIVE_HUNDRED = new FunctionalRomanNumeralRule("D", 500);
    public static final FunctionalRomanNumeralRule COUNT_NINE_HUNDRED = new FunctionalRomanNumeralRule("CM", 900);
    public static final FunctionalRomanNumeralRule COUNT_ONE_THOUSAND = new FunctionalRomanNumeralRule("M", 1000);

    public static final List<FunctionalRomanNumeralRule> COUNT_ALL = Collections.unmodifiableList(Arrays.asList(
        COUNT_ONE_THOUSAND, COUNT_NINE_HUNDRED, COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED,
        COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY,
        COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE
    ));

    public static FunctionalRomanNumeralGenerator create(List<FunctionalRomanNumeralRule> rules) {
        return new FunctionalRomanNumeralGenerator(rules);
    }
}
