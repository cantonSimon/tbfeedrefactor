package com.refactor.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.refactor.tb.tbrefactor.R;
import com.tbrefactor.model.Admin;

public class CreateUserActivity extends AppCompatActivity {

    private Admin admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }

    public void xxxxxAfterLoginOrSignUp(){
//        setResult(xxxxx);
        finish();
    }
}
