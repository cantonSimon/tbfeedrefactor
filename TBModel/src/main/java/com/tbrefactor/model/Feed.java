package com.tbrefactor.model;

import java.io.Serializable;

/**
 * Created by simonlee on 3/29/2017.
 */

public class Feed implements Serializable{

    public static String INTENT_KEY_FEED = "INTENT_KEY_FEED";
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
