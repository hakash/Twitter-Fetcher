/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dittdesign.twittersentimentfetcher;

import twitter4j.*;

/**
 *
 * @author mortenolsrud
 */
public class TwitterSentimentFetcher {
    
    public TwitterSentimentFetcher(){
        TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
        

    }
        

    
    
    public static void main(String[] args){
        TwitterSentimentFetcher fetcher = new TwitterSentimentFetcher();
    }
}
