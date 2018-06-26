package com.example.mohanmmohadikar.javaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView tv1,tv2;

    String name;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);




        Intent i = getIntent();
        score = i.getIntExtra("score", score);
        name = i.getStringExtra("name");


        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

        tv1.setText(name+"'s"+" score");
        tv2.setText(score+"/10");




    }
}

