package com.gdgminna.android.journalapp.fragments;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class RecentJournalsFragment extends JournalListFragment {

    public RecentJournalsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START recent_posts_query]
        // Last 100 posts, these are automatically the 100 most recent
        // due to sorting by push() keys
        Query recentPostsQuery = databaseReference.child("posts")
                .limitToFirst(100);
        recentPostsQuery.keepSynced(true);
        // [END recent_posts_query]

        return recentPostsQuery;
    }

}