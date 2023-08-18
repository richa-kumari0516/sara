package com.example.sara.sentimentanalysis.service;

import com.example.sara.sentimentanalysis.datamodel.Tweet;
import com.example.sara.sentimentanalysis.datamodel.TweetSentimentResponse;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;


@Service
public class SentimentAnalysisServiceImpl implements SentimentAnalysisService{

    static StanfordCoreNLP pipeline;


    public static void init(){
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        pipeline = new StanfordCoreNLP(props);
    }
    @Override
    public TweetSentimentResponse doSentimentAnalysis(Tweet tweet) {
        int sentimentInt;
        String sentimentName = null;
        Annotation annotation = pipeline.process(tweet.getFullText());
        for(CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class))
        {
            Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
            sentimentInt = RNNCoreAnnotations.getPredictedClass(tree);
            sentimentName = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
            System.out.println(sentimentName + "\t" + sentimentInt + "\t" + sentence);
        }
        return new TweetSentimentResponse(tweet.getUserId(), sentimentName);
    }

    public static TweetSentimentResponse abc(Tweet tweet) {
        int sentimentInt;
        String sentimentName = null;
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        pipeline = new StanfordCoreNLP(props);
        Annotation annotation = pipeline.process(tweet.getFullText());
        for(CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class))
        {
            Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
            sentimentInt = RNNCoreAnnotations.getPredictedClass(tree);
            sentimentName = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
            System.out.println(sentimentName + "\t" + sentimentInt + "\t" + sentence);
        }
        return new TweetSentimentResponse(tweet.getUserId(), sentimentName);
    }


    public static void main(String args[]){
        Tweet tweet = new Tweet();
        tweet.setUserId("1234");
        tweet.setFullText("Netcracker rocks!");
        String parseModel = "edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz";
        LexicalizedParser lecicalizedParser = LexicalizedParser.loadModel(parseModel);
        List<? extends HasWord> tokenize = lecicalizedParser.tokenize(tweet.getFullText());

        for(HasWord h :tokenize){
            lecicalizedParser.
        }

        Tree tree = lecicalizedParser.parse(tweet.getFullText());
        int sentimentInt;
        String sentimentName = null;
        sentimentInt = RNNCoreAnnotations.getPredictedClass(tree);
        System.out.println(sentimentInt + "\t");
        //abc(tweet);
    }

}
