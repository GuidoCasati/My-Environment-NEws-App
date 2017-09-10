package com.example.android.myenvironmentnewsapp;

/**
 * Created by guido on 13/07/2017.
 * Inspired by Udacity's lesson
 */


import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of news by using an AsyncTaskLoader to perform the
 * network request to the given URL.
 */
public class NewsLoader extends AsyncTaskLoader<List<News>> {

    /**
     * Query URL
     */
    private String queryURL;

    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public NewsLoader(Context context, String url) {
        super(context);
        queryURL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (queryURL == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of news.
        List<News> newsList = QueryUtils.fetchNewsData(queryURL);
        return newsList;
    }
}

