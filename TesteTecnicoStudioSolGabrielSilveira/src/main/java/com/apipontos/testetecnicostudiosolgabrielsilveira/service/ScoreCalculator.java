package com.apipontos.testetecnicostudiosolgabrielsilveira.service;

import org.springframework.stereotype.Service;

@Service
public class ScoreCalculator {

    public int calculateCombinations(int score) {
        if (score < 0) return 0;

        // Array para armazenar o número de combinações para cada valor até `score`
        int[] dp = new int[score + 1];
        dp[0] = 1; // Base case: 1 maneira de alcançar 0 pontos

        // Possíveis pontuações (Field goal, Touchdown, Touchdown + Extra)
        int[] points = {3, 6, 7, 8};

        for (int point : points) {
            for (int i = point; i <= score; i++) {
                dp[i] += dp[i - point];
            }
        }

        return dp[score];
    }
}
