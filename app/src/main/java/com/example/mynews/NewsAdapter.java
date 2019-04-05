package com.example.mynews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView newsTitle = listItemView.findViewById(R.id.title);
        String title = currentNews.getTitle();
        newsTitle.setText(title);

        TextView newsDate = listItemView.findViewById(R.id.date);
        String date = currentNews.getDate();
        newsDate.setText(date);

        TextView newsSection = listItemView.findViewById(R.id.section);
        String section = currentNews.getSection();
        newsSection.setText(section);

        TextView newsAuthor = listItemView.findViewById(R.id.author);
        String author = currentNews.getAuthor();
        newsAuthor.setText(author);

        return listItemView;
    }
}
