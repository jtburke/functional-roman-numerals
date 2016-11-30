package com.github.jtburke.romannumerals.functional;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalRomanNumeralRuleTest {

    private FunctionalRomanNumeralRule rule(int decimal) {
        return new FunctionalRomanNumeralRule("", decimal);
    }

    private BiNumeral numeral(int decimal) {
        return new BiNumeral("", decimal);
    }

    @Test
    public void whenLessThan_shouldReturnTrue() {
        assertThat(rule(10).appliesTo(numeral(11))).isEqualTo(true);
    }

    @Test
    public void whenEqualTo_shouldReturnTrue() {
        assertThat(rule(10).appliesTo(numeral(10))).isEqualTo(true);
    }

    @Test
    public void whenMoreThan_shouldReturnFalse() {
        assertThat(rule(10).appliesTo(numeral(9))).isEqualTo(false);
    }
}