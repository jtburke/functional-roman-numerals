package com.github.jtburke.romannumerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralGeneratorImplTest {
    private String generate(int number) {
        return new RomanNumeralGeneratorImpl().generate(number);
    }

    @Test
    public void shouldGenerate_I_from_1() {
        assertThat(generate(1)).isEqualTo("I");
    }

    @Test
    public void shouldGenerate_II_from_2() {
        assertThat(generate(2)).isEqualTo("II");
    }
}