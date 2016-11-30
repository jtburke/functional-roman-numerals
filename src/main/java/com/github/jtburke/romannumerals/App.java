package com.github.jtburke.romannumerals;

import java.util.Scanner;

import static com.github.jtburke.romannumerals.FunctionalRomanNumeralGeneratorFactory.COUNT_ALL;

public class App {
    private static final String HORIZONTAL_RULE = "============================================================";
    private static final RomanNumeralGenerator romanNumeralGenerator = FunctionalRomanNumeralGeneratorFactory.create(COUNT_ALL);

    public static void main(String[] args) throws Exception {
        displayWelcomeMessage();

        input();
    }

    private static void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int decimal = Integer.parseInt(scanner.nextLine());
                System.out.println(decimal + " = " + romanNumeralGenerator.generate(decimal));
            } else {
                System.out.println("Please enter a valid integer.");
            }

            input();
        } catch (Exception e) {
            input();
        }
    }

    private static void displayWelcomeMessage() {
        System.out.println("John-Terrance Burke");
        System.out.println(HORIZONTAL_RULE);
        System.out.println("Enter a number then press [Enter] to convert to roman numerals.");
        System.out.println(HORIZONTAL_RULE + "\n");
    }
}