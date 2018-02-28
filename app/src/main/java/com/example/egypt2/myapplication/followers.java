package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class followers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.followers);
    }

    public void setting4(View view) {
        Intent intent = new Intent(followers.this, setting.class);
        startActivity(intent);
    }

    public void books4(View view) {
        Intent intent = new Intent(followers.this, books.class);
        startActivity(intent);
    }

    public void followers4(View view) {
        Intent intent = new Intent(followers.this, my_profile.class);
        startActivity(intent);
    }

    public void activity4(View view) {
        Intent intent = new Intent(followers.this, activity.class);
        startActivity(intent);
    }
}