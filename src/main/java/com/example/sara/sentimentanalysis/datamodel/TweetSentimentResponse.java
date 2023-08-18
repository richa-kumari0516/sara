package com.example.sara.sentimentanalysis.datamodel;

import lombok.Data;

@Data
public class TweetSentimentResponse {

    public TweetSentimentResponse() {
    }

    public TweetSentimentResponse(String userId, String sentiment) {
        this.userId = userId;
        this.sentiment = sentiment;
    }

    private String userId;
    private String sentiment;

}
