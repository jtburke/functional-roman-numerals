package com.github.jtburke.romannumerals.functional;

import com.github.jtburke.romannumerals.RomanNumeralGenerator;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.codepoetics.protonpack.StreamUtils.unfold;

public class FunctionalRomanNumeralGenerator implements RomanNumeralGenerator {
    private final List<FunctionalRomanNumeralRule> rules;

    public FunctionalRomanNumeralGenerator(List<FunctionalRomanNumeralRule> rules) {
        this.rules = rules;
    }

    public String generate(int number) {
        return unfold(new BiNumeral("", number), numeral -> {
            Optional<FunctionalRomanNumeralRule> applicableRule = rules.stream().filter(r -> r.appliesTo(numeral)).findFirst();

            if (!applicableRule.isPresent()) {
                return Optional.empty();
            }

            FunctionalRomanNumeralRule rule = applicableRule.get();
            return Optional.of(new BiNumeral(rule.getRoman(), numeral.getDecimal() - rule.getDecimal()));
        }).map(BiNumeral::getRoman).collect(Collectors.joining());
    }
}
