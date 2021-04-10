package com.example.quinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity {
    private String[] questions = {"Is covid 19 caused by a virus?", "Is the incubation period of covid 19 is 3-7 days?", "Is covid 19 transmitted by droplets in air?", "Is the mortality rate by covid 19 higher in youngsters?", "Can covid 19 be prevented by washing hands for 10 seconds?", "Can covid 19 be prevented by proper nutrition?", "Are covid 19 vaccines 100% effective?", "Is there any drug treatment available for covid 19?", "Do all infected patients need ventilators to survive?", "Is 75% alcohol based hand sanitizer is good enough for preventing covid 19"};
    private boolean[] answers = {true, false, true, false, false, true, false, false, false, true};
    Button button5, button6;
    TextView textView3;
    private int score=0;
    private int index=0;
    private int n=questions.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        textView3 = findViewById(R.id.textView3);
        if (index < questions.length) {
            textView3.setText(questions[index]);
            // button2.setText(option1[index]);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (answers[index]) {
                        score++;
                    }
                    index++;
                    if (index < questions.length) {
                        textView3.setText(questions[index]);
//                        button2.setText(option1[index]);
//                        button4.setText(option2[index]);
//                        button5.setText(option3[index]);
//                        button6.setText(option4[index]);
                    } else {
                        Toast.makeText(MainActivity4.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!answers[index]) {
                        score++;
                    }
                    index++;
                    if (index < questions.length) {
                        textView3.setText(questions[index]);
                        //button4.setText(option2[index]);
                        //button6.setText(option4[index]);
                        //button5.setText(option3[index]);
                        //button2.setText(option1[index]);
                    } else {
                        Toast.makeText(MainActivity4.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
        public void result(View v){
            Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
            intent.putExtra("score", score);
           // intent.putExtra("n", n);
            startActivity(intent);
        }

}

