package com.example.egypt2.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

/*  rb is rate fo book */
/* ru is rate of user  */
public class post extends AppCompatActivity {
    RatingBar rb , ru ;
    TextView comment;
    EditText your_comment;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);
        rb = (RatingBar) findViewById(R.id.rate_of_book);
        ru = (RatingBar) findViewById(R.id.rate_of_user);
        comment = (TextView) findViewById(R.id.comment);
        your_comment = (EditText)findViewById(R.id.your_comment);
        save = (Button) findViewById(R.id.save);

        ru.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rb.setRating(ru.getRating());
            }
        });
    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String s = your_comment.getText().toString();
            comment.setText(s);
        }
    });


        String m =  your_comment.getText().toString();

        comment.setText(m);
    }


}
