package com.refactor.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.refactor.tb.tbrefactor.R;
import com.tbrefactor.contract.HomeContract;
import com.tbrefactor.model.Child;
import com.tbrefactor.model.Feed;
import com.tbrefactor.model.User;

public class MainActivity extends AppCompatActivity{

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initHomePage(){
        Child child = user.getSelectedChild();
        child.openDailyFeed(new Child.OpenDailyFeedRenderer() {
            @Override
            public void openFeedPage(Child child) {
                Feed feed = child.getFeed();
                Intent intent = new Intent(MainActivity.this, FeedActivity.class);
                intent.putExtra(Feed.INTENT_KEY_FEED, feed);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
