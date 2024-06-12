package com.apipontos.testetecnicostudiosolgabrielsilveira.controller;

import com.apipontos.testetecnicostudiosolgabrielsilveira.model.ScoreRequest;
import com.apipontos.testetecnicostudiosolgabrielsilveira.model.ScoreResponse;
import com.apipontos.testetecnicostudiosolgabrielsilveira.service.ScoreCalculator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verify")
public class ScoreController {

    private final ScoreCalculator scoreCalculator;

    public ScoreController(ScoreCalculator scoreCalculator) {
        this.scoreCalculator = scoreCalculator;
    }

    @PostMapping
    public ResponseEntity<ScoreResponse> verifyScore(@RequestBody ScoreRequest scoreRequest) {
        String[] scores = scoreRequest.getScore().split("x");
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        int combinations1 = scoreCalculator.calculateCombinations(score1);
        int combinations2 = scoreCalculator.calculateCombinations(score2);

        int totalCombinations = combinations1 * combinations2;

        return ResponseEntity.ok(new ScoreResponse(totalCombinations));
    }
}
