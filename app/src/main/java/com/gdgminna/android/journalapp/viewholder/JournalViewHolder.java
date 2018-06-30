package com.gdgminna.android.journalapp.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gdgminna.android.journalapp.R;
import com.gdgminna.android.journalapp.models.Journal;

public class JournalViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public ImageView starView;
    public TextView numStarsView;
    public TextView bodyView;

    public JournalViewHolder(View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.post_title);
        authorView = itemView.findViewById(R.id.post_author);
        starView = itemView.findViewById(R.id.star);
        numStarsView = itemView.findViewById(R.id.post_num_stars);
        bodyView = itemView.findViewById(R.id.post_body);
    }

    public void bindToPost(Journal journal, View.OnClickListener starClickListener) {
        titleView.setText(journal.title);
        authorView.setText(journal.author);
        numStarsView.setText(String.valueOf(journal.starCount));
        bodyView.setText(journal.body);

        starView.setOnClickListener(starClickListener);
    }

    {
    }
}