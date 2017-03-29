package com.tbrefactor.contract;

/**
 * Created by simonlee on 3/29/2017.
 */

public interface ContextMenu {
    interface ContextMenuRenderer{
        void displaySelectedChild();
    }

    interface ContextMenuPresenter{
        void onItemClick(String url);
    }

}
