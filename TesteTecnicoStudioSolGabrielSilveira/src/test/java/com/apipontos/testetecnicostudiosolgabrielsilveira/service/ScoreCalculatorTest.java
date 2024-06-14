package com.apipontos.testetecnicostudiosolgabrielsilveira.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCalculatorTest {

    private final ScoreCalculator scoreCalculator = new ScoreCalculator();

    @Test
    void testCalculateCombinationsForZeroScore() {
        int result = scoreCalculator.calculateCombinations(0);
        assertEquals(1, result, "Esperado 1 combinação para a pontuação 0");
    }

    @Test
    void testCalculateCombinationsForNegativeScore() {
        int result = scoreCalculator.calculateCombinations(-1);
        assertEquals(0, result, "Esperado 0 combinações para pontuação negativa");
    }

    @Test
    void testCalculateCombinationsForThreePoints() {
        int result = scoreCalculator.calculateCombinations(3);
        assertEquals(1, result, "Esperado 1 combinação para a pontuação 3");
    }

    @Test
    void testCalculateCombinationsForSixPoints() {
        int result = scoreCalculator.calculateCombinations(6);
        assertEquals(2, result, "Esperado 2 combinação para a pontuação 6 (6, 3+3)");
    }

    @Test
    void testCalculateCombinationsForSevenPoints() {
        int result = scoreCalculator.calculateCombinations(7);
        assertEquals(1, result, "Esperado 1 combinação para a pontuação 7 (6+1)");
    }

    @Test
    void testCalculateCombinationsForEightPoints() {
        int result = scoreCalculator.calculateCombinations(8);
        assertEquals(1, result, "Esperado 1 combinação para a pontuação 8 (6+2)");
    }
    @Test
    void testCalculateCombinationsForNinePoints() {
        int result = scoreCalculator.calculateCombinations(9);
        assertEquals(2, result, "Esperado 2 combinação para a pontuação 9 (6+3)");
    }

    @Test
    void testCalculateCombinationsForFifteenPoints() {
        int result = scoreCalculator.calculateCombinations(15);
        assertEquals(4, result, "Esperado 4 combinações para a pontuação 15");
    }
}
