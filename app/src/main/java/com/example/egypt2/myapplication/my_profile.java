package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class my_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
    }

    public void books5(View view) {
        Intent intent = new Intent(my_profile.this, books.class);
        startActivity(intent);
    }

    public void followers5(View view) {
        Intent intent = new Intent(my_profile.this, followers.class);
        startActivity(intent);
    }

    public void activity5(View view) {
        Intent intent = new Intent(my_profile.this, activity.class);
        startActivity(intent);
    }

    public void setting5(View view) {
        Intent intent = new Intent(my_profile.this, setting.class);
        startActivity(intent);

    }
    public void books22(View view) {
        Intent intent = new Intent(my_profile.this, books_post.class);
        startActivity(intent);

    }

}