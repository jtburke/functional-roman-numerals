package com.github.jtburke.romannumerals.functional;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_ALL;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_FIFTY;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_FIVE;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_FIVE_HUNDRED;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_FORTY;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_FOUR;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_FOUR_HUNDRED;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_NINE;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_NINETY;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_NINE_HUNDRED;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_ONE;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_ONE_HUNDRED;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_ONE_THOUSAND;
import static com.github.jtburke.romannumerals.functional.FunctionalRomanNumeralGeneratorFactory.COUNT_TEN;
import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalRomanNumeralGeneratorTest {

    private String generate(int number, List<FunctionalRomanNumeralRule> rules) {
        return new FunctionalRomanNumeralGenerator(rules).generate(number);
    }

    private void test(int decimal, String roman, FunctionalRomanNumeralRule... partialRules) {
        assertThat(generate(decimal, Arrays.asList(partialRules))).isEqualTo(roman);
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

    @Test
    public void XLIX_from_49() {
        test(49, "XLIX", COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void L_from_50() {
        test(50, "L", COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void LXXXIX_from_89() {
        test(89, "LXXXIX", COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void XC_from_90() {
        test(90, "XC", COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void C_from_100() {
        test(100, "C", COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void CC_from_200() {
        test(200, "CC", COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void CD_from_400() {
        test(400, "CD", COUNT_FOUR_HUNDRED, COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void D_from_500() {
        test(500, "D", COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED, COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void CM_from_900() {
        test(900, "CM", COUNT_NINE_HUNDRED, COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED, COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void M_from_1000() {
        test(1000, "M", COUNT_ONE_THOUSAND, COUNT_NINE_HUNDRED, COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED, COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }

    @Test
    public void MMMCMXCIX_from_3999() {
        test(3999, "MMMCMXCIX", COUNT_ONE_THOUSAND, COUNT_NINE_HUNDRED, COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED, COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY, COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE);
    }
}