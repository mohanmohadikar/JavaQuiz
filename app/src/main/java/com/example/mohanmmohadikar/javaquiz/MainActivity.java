package com.example.mohanmmohadikar.javaquiz;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

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

            if(name.isEmpty()){

                Toast.makeText(MainActivity.this, "Field can't be empty", Toast.LENGTH_LONG).show();
            }
            else if (name.length() > 10) {

                Toast.makeText(MainActivity.this, "Your name should be less than 10 character", Toast.LENGTH_LONG).show();


            }
            else{


                sendTo();

            }





        });




    }

    private void sendTo() {

        Intent i = new Intent(MainActivity.this, one.class);
        i.putExtra("name", name);
        startActivity(i);
        finish();

    }



}
