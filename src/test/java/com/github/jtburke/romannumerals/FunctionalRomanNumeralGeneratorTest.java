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

    private static final BiNumeral[] COUNT_ALL = new BiNumeral[] {
        COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE
    };

    private String generate(int number, BiNumeral... rules) {
        return new FunctionalRomanNumeralGenerator(Arrays.asList(rules)).generate(number);
    }

    @Test
    public void I_from_1() {
        assertThat(generate(1, COUNT_ONE)).isEqualTo("I");
        assertThat(generate(1, COUNT_ALL)).isEqualTo("I");
    }

    @Test
    public void II_from_2() {
        assertThat(generate(2, COUNT_ONE)).isEqualTo("II");
        assertThat(generate(2, COUNT_ALL)).isEqualTo("II");
    }

    @Test
    public void III_from_3() {
        assertThat(generate(3, COUNT_ONE)).isEqualTo("III");
        assertThat(generate(3, COUNT_ALL)).isEqualTo("III");
    }

    @Test
    public void IV_from_4() {
        assertThat(generate(4, COUNT_FOUR, COUNT_ONE)).isEqualTo("IV");
        assertThat(generate(4, COUNT_ALL)).isEqualTo("IV");
    }

    @Test
    public void V_from_5() {
        assertThat(generate(5, COUNT_FIVE, COUNT_FOUR, COUNT_ONE)).isEqualTo("V");
        assertThat(generate(5, COUNT_ALL)).isEqualTo("V");
    }

    @Test
    public void VI_from_6() {
        assertThat(generate(6, COUNT_FIVE, COUNT_FOUR, COUNT_ONE)).isEqualTo("VI");
        assertThat(generate(6, COUNT_ALL)).isEqualTo("VI");
    }

    @Test
    public void VII_from_7() {
        assertThat(generate(7, COUNT_FIVE, COUNT_FOUR, COUNT_ONE)).isEqualTo("VII");
        assertThat(generate(7, COUNT_ALL)).isEqualTo("VII");
    }

    @Test
    public void VIII_from_8() {
        assertThat(generate(8, COUNT_FIVE, COUNT_FOUR, COUNT_ONE)).isEqualTo("VIII");
        assertThat(generate(8, COUNT_ALL)).isEqualTo("VIII");
    }

    @Test
    public void IX_from_9() {
        assertThat(generate(9, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE)).isEqualTo("IX");
        assertThat(generate(9, COUNT_ALL)).isEqualTo("IX");
    }

    @Test
    public void X_from_10() {
        assertThat(generate(10, COUNT_TEN, COUNT_FIVE, COUNT_FOUR, COUNT_ONE)).isEqualTo("X");
        assertThat(generate(10, COUNT_ALL)).isEqualTo("X");
    }
}