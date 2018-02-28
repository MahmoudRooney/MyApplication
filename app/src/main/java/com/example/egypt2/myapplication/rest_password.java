package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rest_password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rest_password);
    }

    public void submit2(View view) {
        Intent intent = new Intent(rest_password.this, my_profile.class);
        startActivity(intent);
    }

    public void aa(View view) {

        Intent intent = new Intent(rest_password.this, setting.class);
        startActivity(intent);
    }   public void bb(View view) {
        Intent intent = new Intent(rest_password.this, parsonal.class);
        startActivity(intent);

    }   public void back2(View view) {
        Intent intent = new Intent(rest_password.this, my_profile.class);
        startActivity(intent);
    }   public void change2(View view) {
        Intent intent = new Intent(rest_password.this, my_profile.class);
        startActivity(intent);
    }
}