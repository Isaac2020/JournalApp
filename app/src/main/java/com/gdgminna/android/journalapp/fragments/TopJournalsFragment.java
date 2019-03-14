package com.gdgminna.android.journalapp.fragments;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class TopJournalsFragment extends JournalListFragment {

    public TopJournalsFragment() {
    }

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START my_top_posts_query]
        // My top posts by number of stars
        String myUserId = getUid();
        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)
                .orderByChild("starCount");
        myTopPostsQuery.keepSynced(true);
        // [END my_top_posts_query]

        return myTopPostsQuery;
    }
}
