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
    private static final BiNumeral COUNT_FIFTY = new BiNumeral("L", 50);
    private static final BiNumeral COUNT_NINETY = new BiNumeral("XC", 90);
    private static final BiNumeral COUNT_ONE_HUNDRED = new BiNumeral("C", 100);
    private static final BiNumeral COUNT_FOUR_HUNDRED = new BiNumeral("CD", 400);
    private static final BiNumeral COUNT_FIVE_HUNDRED = new BiNumeral("D", 500);
    private static final BiNumeral COUNT_NINE_HUNDRED = new BiNumeral("CM", 900);
    private static final BiNumeral COUNT_ONE_THOUSAND = new BiNumeral("M", 1000);

    private static final BiNumeral[] COUNT_ALL = new BiNumeral[] {
        COUNT_ONE_THOUSAND, COUNT_NINE_HUNDRED, COUNT_FIVE_HUNDRED, COUNT_FOUR_HUNDRED,
        COUNT_ONE_HUNDRED, COUNT_NINETY, COUNT_FIFTY, COUNT_FORTY,
        COUNT_TEN, COUNT_NINE, COUNT_FIVE, COUNT_FOUR, COUNT_ONE
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