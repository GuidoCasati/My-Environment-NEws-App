package com.example.android.myenvironmentnewsapp;

/**
 * Created by guido on 13/07/2017.
 * Inspired by Udacity's lesson
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.HeaderTwo);
        sectionView.setText(currentNews.getNewsSection());

        TextView titleView = (TextView) listItemView.findViewById(R.id.HeaderOne);
        titleView.setText(currentNews.getNewsTitle());

        TextView dateView = (TextView) listItemView.findViewById(R.id.Content);
        dateView.setText(currentNews.getNewsDate());

        return listItemView;
    }
}
