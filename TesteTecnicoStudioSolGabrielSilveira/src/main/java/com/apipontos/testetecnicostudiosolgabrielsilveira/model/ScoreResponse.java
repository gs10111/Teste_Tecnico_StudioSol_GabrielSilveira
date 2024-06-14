package com.apipontos.testetecnicostudiosolgabrielsilveira.model;

/**
 *  classe usada para retornar o numero de combinacoes possiveis de pontuacao.
 */
public class ScoreResponse {

    private int combinations;

    public ScoreResponse(int combinations) {
        this.combinations = combinations;
    }

    public int getCombinations() {
        return combinations;
    }

    public void setCombinations(int combinations) {
        this.combinations = combinations;
    }
}
