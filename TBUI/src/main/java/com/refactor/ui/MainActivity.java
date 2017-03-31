package com.refactor.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.refactor.tb.tbrefactor.R;
import com.tbrefactor.contract.HomeContract;
import com.tbrefactor.model.Admin;
import com.tbrefactor.model.Child;
import com.tbrefactor.model.Feed;
import com.tbrefactor.model.User;

public class MainActivity extends AppCompatActivity{

    private Admin admin;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handleOpenApp();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            // After login or sign up
            case 0: initHomePage(); break;
            // After welcome with no user
            case 1: createUser(); break;
        }
    }

    private void handleOpenApp(){
        //init admin
        if(admin.getUser() == null){
            admin.youWelcome(new Admin.YouWelcomeRenderer() {
                @Override
                public void firstUse() {
                    Intent intent = new Intent(MainActivity.this, EducationActivity.class);
                    startActivity(intent);
                }

                @Override
                public void notFirstUse() {
                    createUser();
                }
            });

        }else {
            initHomePage();
        }
    }



    private void initHomePage(){
        //Some pre-data loading and rxjava process
        //..........

        admin.getUser().enterYourSpace(new User.EnterYourSpaceRenderer() {
            @Override
            public void openHomePage() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void createUser(){
        admin.createUser(new Admin.CreateUserRenderer() {
            @Override
            public void beforeCreateUser() {
                Intent intent = new Intent(MainActivity.this, CreateUserActivity.class);
                startActivity(intent);
            }
        });
    }

}
