package com.example.sara.sentimentanalysis.controller;

import com.example.sara.sentimentanalysis.datamodel.Tweet;
import com.example.sara.sentimentanalysis.datamodel.TweetSentimentResponse;
import com.example.sara.sentimentanalysis.service.SentimentAnalysisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class SentimentAnalysisController {

    private SentimentAnalysisService sentimentAnalysisService;

    @PostMapping("/sentimentAnalysis")
    public ResponseEntity getSentimentAnalysis(@RequestBody Tweet tweet) {
        sentimentAnalysisService.doSentimentAnalysis(tweet);
        return new ResponseEntity(new TweetSentimentResponse(), HttpStatus.OK);
    }
}
