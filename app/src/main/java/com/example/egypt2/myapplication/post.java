package com.example.egypt2.myapplication;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/*  rb is rate fo book */
/* ru is rate of user  */
    public class post extends AppCompatActivity {
    RatingBar rb , ru ;
    ListView comment;
    EditText your_comment;
    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    FirebaseDatabase database =    FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("massage");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);
        rb = (RatingBar) findViewById(R.id.rate_of_book);
        ru = (RatingBar) findViewById(R.id.rate_of_user);
        comment = (ListView) findViewById(R.id.comment);
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
    public void onClick(View v) {

       String getInput = your_comment.getText().toString();
       if (addArray.contains(getInput)){
           Toast.makeText(getBaseContext(),"item add to array",Toast.LENGTH_LONG).show();
       }
else if (getInput== null ){
           Toast.makeText(getBaseContext(),"No comment",Toast.LENGTH_LONG).show();
       }
else {
    addArray.add(getInput);
           ArrayAdapter<String> adapter =new ArrayAdapter<String>(post.this, android.R.layout.simple_list_item_1, addArray);
                   comment.setAdapter(adapter);
           ((EditText)findViewById(R.id.your_comment)).setText("");

    }}
});
}}
