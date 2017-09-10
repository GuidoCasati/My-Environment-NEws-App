package com.example.android.myenvironmentnewsapp;

/**
 * Created by guido on 13/07/2017.
 * Inspired by Udacity's lesson
 */


public class News {



    private String mNewsTitle;
    private String mNewsSection;
    private String mNewsDate;
    private String mNewsUrl;


    public News(String newsTitle, String newsSection, String newsUrl, String newsDate) {
        mNewsTitle = newsTitle;
        mNewsSection = newsSection;
        mNewsUrl = newsUrl;
        mNewsDate = newsDate;
    }


    public String getNewsTitle() {
        return mNewsTitle;
    }

    public String getNewsSection() {
        return mNewsSection;
    }

    public String getNewsDate() {
        return mNewsDate;
    }

    public String getNewsUrl() {
        return mNewsUrl;
    }

}
