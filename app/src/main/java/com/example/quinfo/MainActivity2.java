package com.example.quinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private String[] questions={"Is covid 19 caused by a virus?", "Is the incubation period of covid 19 is 3-7 days?", "Is covid 19 transmitted by droplets in air?", "Is the mortality rate by covid 19 higher in youngsters?", "Can covid 19 be prevented by washing hands for 10 seconds?", "Can covid 19 be prevented by proper nutrition?", "Are covid 19 vaccines 100% effective?", "Is there any drug treatment available for covid 19?", "Do all infected patients need ventilators to survive?", "Is 75% alcohol based hand sanitizer is good enough for preventing covid 19"};
    private boolean[] answers={true,false,true,false,false,true,false,false,false,true};
    TextView textView2;
    Button button2, button3;
    private int score=0;
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        textView2.setText(questions[index]);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<questions.length){
                    if(answers[index]){
                        score++;
                    }
                    index++;
                    if (index<questions.length){
                        textView2.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<questions.length){
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if (index<questions.length){
                        textView2.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}