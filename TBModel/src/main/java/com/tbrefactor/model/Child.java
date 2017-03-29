package com.tbrefactor.model;

import com.tbrefactor.Command;
import com.tbrefactor.contract.HomeContract;

/**
 * Created by simonlee on 3/29/2017.
 */

public class Child {

    private User user;
    private ChildProfile childProfile;
    private FeedNotification feedNotification;
    private Gallery gallery;
    private Feed feed;

    public Feed getFeed() {
        return feed;
    }

    public void openDailyFeed(OpenDailyFeedRenderer openDailyFeedRenderer){
        openDailyFeedRenderer.openFeedPage(this);
    }

    public void closeDailyFeed(){}

    public interface OpenDailyFeedRenderer{
        void openFeedPage(Child child);
    }

}
