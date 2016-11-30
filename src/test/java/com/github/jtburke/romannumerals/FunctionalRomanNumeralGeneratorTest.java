package com.github.jtburke.romannumerals;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalRomanNumeralGeneratorTest {

    private static final BiNumeral COUNT_ONE = new BiNumeral("I", 1);
    private static final BiNumeral COUNT_FOUR = new BiNumeral("IV", 4);
    private static final BiNumeral COUNT_FIVE = new BiNumeral("V", 5);
    private static final BiNumeral COUNT_NINE = new BiNumeral("IX", 9);
    private static final BiNumeral COUNT_TEN = new BiNumeral("X", 10);
    private static final BiNumeral COUNT_FORTY = new BiNumeral("XL", 40);

    private static final BiNumeral[] COUNT_ALL = new BiNumeral[] {
        COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE
    };

    private String generate(int number, BiNumeral... rules) {
        return new FunctionalRomanNumeralGenerator(Arrays.asList(rules)).generate(number);
    }

    public void test(int decimal, String roman, BiNumeral... partialRules) {
        assertThat(generate(decimal, partialRules)).isEqualTo(roman);
        assertThat(generate(decimal, COUNT_ALL)).isEqualTo(roman);
    }

    @Test
    public void I_from_1() {
        test(1, "I", COUNT_ONE);
    }

    @Test
    public void II_from_2() {
        test(2, "II", COUNT_ONE);
    }

    @Test
    public void III_from_3() {
        test(3, "III", COUNT_ONE);
    }

    @Test
    public void IV_from_4() {
        test(4, "IV", COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void V_from_5() {
        test(5, "V", COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void VI_from_6() {
        test(6, "VI", COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void VII_from_7() {
        test(7, "VII", COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void VIII_from_8() {
        test(8, "VIII", COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void IX_from_9() {
        test(9, "IX", COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void X_from_10() {
        test(10, "X", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XI_from_11() {
        test(11, "XI", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XIV_from_14() {
        test(14, "XIV", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XV_from_15() {
        test(15, "XV", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XVIII_from_18() {
        test(18, "XVIII", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XIX_from_19() {
        test(19, "XIX", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XX_from_20() {
        test(20, "XX", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XXXIX_from_39() {
        test(39, "XXXIX", COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XL_from_40() {
        test(40, "XL", COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }
}