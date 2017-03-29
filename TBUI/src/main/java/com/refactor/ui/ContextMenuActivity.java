package com.refactor.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.refactor.tb.tbrefactor.R;
import com.tbrefactor.contract.ContextMenu;

public class ContextMenuActivity extends AppCompatActivity implements ContextMenu.ContextMenuRenderer{

    private ContextMenu.ContextMenuPresenter mContextMenuPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
    }

    private void initView(){

    }

    @Override
    public void displaySelectedChild() {

    }
}
