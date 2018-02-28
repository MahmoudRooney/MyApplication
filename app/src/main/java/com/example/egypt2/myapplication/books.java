package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);
    }  public void books2 (View view){
        Intent intent = new Intent(books.this,my_profile.class);
        startActivity(intent);
    }  public void followers2 (View view){
        Intent intent = new Intent(books.this,followers.class);
        startActivity(intent);
    }  public void activity2 (View view){
        Intent intent = new Intent(books.this,activity.class);
        startActivity(intent);
    }  public void setting2 (View view){
        Intent intent = new Intent(books.this,setting.class);
        startActivity(intent);
    }
}
