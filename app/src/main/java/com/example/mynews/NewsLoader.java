package com.example.mynews;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static String REQUEST_URL =
            "https://content.guardianapis.com/search?&show-tags=contributor&api-key=1205bd93-b6c3-4f90-9eac-eba3ff2c2b02";

    NewsLoader(Context context) {
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