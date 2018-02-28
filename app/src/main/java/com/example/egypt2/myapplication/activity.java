package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
    }
    public void setting3 (View view) {
        Intent intent = new Intent(activity.this, setting.class);
        startActivity(intent);
    }  public void books3 (View view) {
        Intent intent = new Intent(activity.this, books.class);
        startActivity(intent);
    }  public void followers3 (View view) {
        Intent intent = new Intent(activity.this, followers.class);
        startActivity(intent);
    }  public void activity3 (View view) {
        Intent intent = new Intent(activity.this, my_profile.class);
        startActivity(intent);
    }
}
