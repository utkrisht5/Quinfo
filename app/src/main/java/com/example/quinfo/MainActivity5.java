package com.example.quinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView4=findViewById(R.id.textView4);
        int s = Integer.parseInt(getIntent().getExtras().getString("score"));
        int a = Integer.parseInt(getIntent().getExtras().getString("n"));
        if (s==a){
            textView4.setText("Your Score is " + s + "Congratulations! You are fully aware");
        }
        else{
            textView4.setText("Your Score is " + s + "Better luck next time!");
        }
    }
}