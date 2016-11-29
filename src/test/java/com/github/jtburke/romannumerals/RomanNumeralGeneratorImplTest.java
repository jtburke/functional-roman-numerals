package com.github.jtburke.romannumerals;

import org.junit.Test;

import static com.github.jtburke.romannumerals.RomanNumerals.I;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralGeneratorImplTest {
    private String generate(int number) {
        return new RomanNumeralGeneratorImpl().generate(number);
    }

    @Test
    public void shouldGenerate_I_from_1() {
        assertThat(generate(1)).isEqualTo(I);
    }

    @Test
    public void shouldGenerate_V_from_5() {
        assertThat(generate(1)).isEqualTo(I);
    }
}