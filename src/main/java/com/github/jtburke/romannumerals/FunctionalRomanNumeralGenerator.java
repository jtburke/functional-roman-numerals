package com.github.jtburke.romannumerals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.codepoetics.protonpack.StreamUtils.unfold;

public class FunctionalRomanNumeralGenerator implements RomanNumeralGenerator {
    private List<BiNumeral> rules;

    public FunctionalRomanNumeralGenerator(List<BiNumeral> rules) {
        this.rules = rules;
    }

    public String generate(int number) {
        return unfold(new BiNumeral("", number), numeral -> {
            Optional<BiNumeral> applicableRule = rules.stream().filter(r -> numeral.decimal >= r.decimal).findFirst();

            if (!applicableRule.isPresent()) {
                return Optional.empty();
            }

            BiNumeral rule = applicableRule.get();
            return Optional.of(new BiNumeral(rule.roman, numeral.decimal - rule.decimal));
        }).map(n -> n.roman).collect(Collectors.joining());
    }
}
