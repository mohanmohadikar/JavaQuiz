package com.example.mohanmmohadikar.javaquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class two extends AppCompatActivity {

    Button b1;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;

    String name;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Question 2");


        Intent i = getIntent();
        score = i.getIntExtra("score", score);
        name = i.getStringExtra("name");


        b1 = (Button)findViewById(R.id.b1);
        rg = (RadioGroup)findViewById(R.id.rg);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        rb4 = (RadioButton)findViewById(R.id.rb4);


        b1.setOnClickListener(v->{

            q();
            sendTo();

        });


    }

    private void sendTo() {

        Intent i = new Intent(two.this, three.class);
        i.putExtra("score", score);
        i.putExtra("name", name);
        startActivity(i);
        finish();

    }

    private void q() {

        if(rb2.isChecked()){
            score++;
        }


    }


}
