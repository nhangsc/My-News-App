package com.example.mynews;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static String REQUEST_URL =
            "https://content.guardianapis.com/search?api-key=e61714d1-2de3-420f-aace-6270490fb304";

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        List<News> newsList = QueryUltis.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}