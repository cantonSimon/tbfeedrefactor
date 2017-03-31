package com.tbrefactor.model;

/**
 * Created by simonlee on 3/30/2017.
 */

public class Admin {
    private User user;
    private boolean isFirstUse;


    public interface CreateUserRenderer{
        void beforeCreateUser();
    }
    public void createUser(CreateUserRenderer createUserRenderer){
        createUserRenderer.beforeCreateUser();
    }

    public interface RemoveUserRenderer{
        void otherThing();
        void afterRemoveUser();
    }
    public void removeUser(RemoveUserRenderer removeUserRenderer){
        user = null;
        removeUserRenderer.otherThing();
        removeUserRenderer.afterRemoveUser();
    }

    public interface YouWelcomeRenderer{
        void firstUse();
        void notFirstUse();
    }
    public void youWelcome(YouWelcomeRenderer youWelcomeRenderer){
        if(isFirstUse){
            youWelcomeRenderer.firstUse();
        }else {
            youWelcomeRenderer.notFirstUse();
        }
    }




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
