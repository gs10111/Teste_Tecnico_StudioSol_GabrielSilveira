package com.apipontos.testetecnicostudiosolgabrielsilveira.model;

public class ScoreResponse {
    private int combinations;

    public ScoreResponse(int combinations) {
        this.combinations = combinations;
    }

    // Getters e setters
    public int getCombinations() {
        return combinations;
    }

    public void setCombinations(int combinations) {
        this.combinations = combinations;
    }
}
