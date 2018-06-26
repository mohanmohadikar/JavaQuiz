package com.example.mohanmmohadikar.javaquiz;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1;
    TextInputLayout il;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button)findViewById(R.id.b1);
        il = (TextInputLayout) findViewById(R.id.il);

        b1.setOnClickListener(v->{

            name = il.getEditText().getText().toString().trim();

            sendTo();

        });




    }

    private void sendTo() {

        Intent i = new Intent(MainActivity.this, one.class);
        i.putExtra("name", name);
        startActivity(i);
        finish();

    }
}
