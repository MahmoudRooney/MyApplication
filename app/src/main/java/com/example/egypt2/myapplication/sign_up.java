package com.example.egypt2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

    }
    public void back (View view){
        Intent intent=new Intent (sign_up.this,MainActivity.class);
        startActivity(intent);
    }
    public void submit (View view){
        Intent intent = new Intent(sign_up.this,my_profile.class);
        startActivity(intent);
    }
}
