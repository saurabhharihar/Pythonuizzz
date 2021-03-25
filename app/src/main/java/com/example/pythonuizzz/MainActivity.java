package com.example.pythonuizzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score=1;
    int index=0;
    int queno=0;
    private TextView textView;
    private Button yes;
    private Button no;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       String[] questions = {" Is Python created by Sundar Pichai ? ", " Can we make AI using Python ? ", " Python was introduced in 1992 ", " Is Python Object oriented \n \t programming  language ? ", " Input in python is 'String' By default", " Is pyhton dynamically typed ? "," Tuples in python are mutable "};
        String[] answers = {"no", "yes", "no", "yes", "yes", "yes","no"};
        textView = findViewById(R.id.textView);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView2=findViewById(R.id.textView2);
        queno=index+1;
        textView.setText("Q."+queno+questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<questions.length-1){
                    if(answers[index] == "yes"){
                        ++score;
                    }
                    index++;
                    queno++;
                    textView.setText("Q."+queno+questions[index]);
                }
                else{  // Toast
                    textView2.setText(" Quiz is finished and your score is "+score+"/"+questions.length+" \n Restart application to play again .");
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<questions.length-1){
                    if(answers[index] == "no"){
                        ++score;
                    }
                    index++;
                    queno++;
                    textView.setText("Q."+queno+questions[index]);
                }else{
                    textView2.setText(" Quiz is finished and your score is "+score+"/"+questions.length+" \n Restart application to play again .");
                }
            }
        });
        }
    }
