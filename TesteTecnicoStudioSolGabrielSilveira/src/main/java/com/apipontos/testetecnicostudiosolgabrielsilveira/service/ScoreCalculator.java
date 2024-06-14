package com.apipontos.testetecnicostudiosolgabrielsilveira.service;

import org.springframework.stereotype.Service;


/**
 * classe responsavel para calcular o numero de combinacoes possiveis de pontos
 */
@Service

public class ScoreCalculator {


    /**
     * @param score pontuacao para a qual calcular as combinacoes possiveis.
     * @return o numero combinacoes para a pontuacao dada .
     */
    public int calculateCombinations(int score) {
        if (score < 0) return 0;

        int[] combinations = new int[score + 1];
        combinations[0] = 1;

        int[] points = {3, 6, 7, 8};

        for (int point : points) {
            for (int i = point; i <= score; i++) {
                combinations[i] += combinations[i - point];
            }
        }

        return combinations[score];
    }
}





