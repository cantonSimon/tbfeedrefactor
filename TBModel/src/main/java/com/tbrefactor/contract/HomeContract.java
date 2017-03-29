package com.tbrefactor.contract;

import com.tbrefactor.model.Child;
import com.tbrefactor.model.User;

/**
 * Created by simonlee on 3/29/2017.
 */

public interface HomeContract {
    interface HomeRenderer{
        void clearAllPage();
        void openFeedPage(Child child);
    }

    interface HomePresenter{
        void initHomePage(User user);
    }

    interface FeedProvider{

    }
}
