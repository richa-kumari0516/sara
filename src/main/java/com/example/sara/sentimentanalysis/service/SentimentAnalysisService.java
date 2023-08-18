package com.example.sara.sentimentanalysis.service;

import com.example.sara.sentimentanalysis.datamodel.Tweet;
import com.example.sara.sentimentanalysis.datamodel.TweetSentimentResponse;
import org.springframework.stereotype.Service;

@Service
public interface SentimentAnalysisService {

    public TweetSentimentResponse doSentimentAnalysis(Tweet tweet);
}
