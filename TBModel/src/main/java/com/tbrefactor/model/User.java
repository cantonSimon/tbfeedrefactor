package com.tbrefactor.model;

import java.util.List;

/**
 * Created by simonlee on 3/29/2017.
 */

public class User {

    private UserProfile userProfile;
    private BirthClub birthClub;
    private List<Child> children;

    private Child selectChild;

    public Child getSelectedChild(){
        //..........
        return selectChild;
    }

    public interface EnterYourSpaceRenderer{
        void openHomePage();
    }
    public void enterYourSpace(EnterYourSpaceRenderer enterYourSpaceRenderer){
        enterYourSpaceRenderer.openHomePage();
    }

    public void changeSelectedChild(Child child){
        //.........
        selectChild = child;
    }

    public void removeChild(Child child){
        //..........
        child.closeDailyFeed();
        children.remove(child);
    }
}
