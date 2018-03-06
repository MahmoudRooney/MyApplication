package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_signup(View view) {
        Intent intent = new Intent(MainActivity.this, sign_up.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(MainActivity.this, my_profile.class);
        startActivity(intent);
    }
    public void pass(View view) {
        Intent intent = new Intent(MainActivity.this, rest_password.class);
        startActivity(intent);
    }

}