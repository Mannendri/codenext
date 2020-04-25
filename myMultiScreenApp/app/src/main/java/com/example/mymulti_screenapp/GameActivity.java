package com.example.mymulti_screenapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    TextView questionTextView;
    int currentIndex;
    Question currentQuestion;
    ArrayList<Question> questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionTextView = findViewById(R.id.questionTextView);
        questions = new ArrayList<Question>();
        addQuestions();
        currentIndex=0;
        questionTextView.setText(questions.get(0).getQuestion());
    }

    private void addQuestions() {
        questions.add(new Question("Can COVID-19 be spread via 5G mobile networks?",false));
        questions.add(new Question("Is it possible to recover from COVID-19?",true));
        questions.add(new Question("Will exposing yourself to the sun or to high temperatures prevent COVID-19?",false));
        questions.add(new Question("Is washing your hands more effective than using hand sanitizer?",true));
        questions.add(new Question("Will cold weather kill COVID-19?",false));
        questions.add(new Question("Will a vaccine against pneumonia protect you from COVID-19?",false));
        questions.add(new Question("Can COVID-19 affect anyone regardless of ethnicity?",true));
        questions.add(new Question("Are people of Asian descent more likely to be affected by COVID-19?",false));
    }

    public void trueButtonClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if(currentQuestion.getAnswer()==true){
            message = Toast.makeText(getApplicationContext(),"Correct!", Toast.LENGTH_SHORT);
            message.show();
        }
        else{
            message = Toast.makeText(getApplicationContext(),"Incorrect!", Toast.LENGTH_SHORT);
            message.show();
        }
        if (currentIndex==questions.size()-1){
            currentIndex=0;
        }
        else{
            currentIndex++;
        }
        questionTextView.setText(questions.get(currentIndex).getQuestion());
    }

    public void falseButtonClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if(currentQuestion.getAnswer()==false){
            message = Toast.makeText(getApplicationContext(),"Correct!", Toast.LENGTH_SHORT);
            message.show();
        }
        else{
            message = Toast.makeText(getApplicationContext(),"Incorrect!", Toast.LENGTH_SHORT);
            message.show();
        }
        if (currentIndex==questions.size()-1){
            currentIndex=0;
        }
        else{
            currentIndex++;
        }
        questionTextView.setText(questions.get(currentIndex).getQuestion());
    }
}
