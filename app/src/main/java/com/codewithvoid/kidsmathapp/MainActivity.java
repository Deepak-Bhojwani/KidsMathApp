package com.codewithvoid.kidsmathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout addition;
    private LinearLayout subtraction;
    private LinearLayout multiplication;
    private LinearLayout division;
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addition = findViewById(R.id.additionLayout);
        subtraction = findViewById(R.id.subtractionLayout);
        multiplication = findViewById(R.id.multiplicationLayout);
        division = findViewById(R.id.divisionLayout);

        final Button  startBtn = findViewById(R.id.startQuizBtn);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "addition";
                setWhiteBackground();
                addition.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "subtraction";
                setWhiteBackground();
                subtraction.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "multiplication";
                setWhiteBackground();
                multiplication.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "division";
                setWhiteBackground();
                division.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Select The Topic...!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }

    public void setWhiteBackground(){
        addition.setBackgroundResource(R.drawable.round_back_white_10);
        subtraction.setBackgroundResource(R.drawable.round_back_white_10);
        multiplication.setBackgroundResource(R.drawable.round_back_white_10);
        division.setBackgroundResource(R.drawable.round_back_white_10);
    }

}