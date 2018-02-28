package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
    }


    public void avatar2(View view) {
        Intent intent = new Intent(setting.this, parsonal.class);
        startActivity(intent);
    }   public void pass3(View view) {
        Intent intent = new Intent(setting.this, rest_pass.class);
        startActivity(intent);
    }   public void back1(View view) {
        Intent intent = new Intent(setting.this, my_profile.class);
        startActivity(intent);
    }   public void change1(View view) {
        Intent intent = new Intent(setting.this, my_profile.class);
        startActivity(intent);
    }
}
