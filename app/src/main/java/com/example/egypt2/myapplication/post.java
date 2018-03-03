package com.example.egypt2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class post extends AppCompatActivity {
    RatingBar rb , ru ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        rb = (RatingBar) findViewById(R.id.rate_of_book);
        ru = (RatingBar) findViewById(R.id.rate_of_user);
        ru.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rb.setRating(ru.getRating());
            }
        });
    }

}
