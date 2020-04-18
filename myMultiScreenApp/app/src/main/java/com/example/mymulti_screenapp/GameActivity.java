package com.example.mymulti_screenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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
        poseQuestion();

    }

    private void addQuestions() {
        questions.add(new Question("COVID-19 can be spread via 5G mobile networks.",false));
        questions.add(new Question("It is possible to recover from COVID-19",true));
        questions.add(new Question("A vaccine is going to save us from the current COVID-19 pandemic.",false));
        questions.add(new Question("Washing your hands is more effective than using hand sanitizer.",true));
    }
    private void poseQuestion() {
        int number = currentIndex;
        while(currentIndex==number) {
            currentIndex = (int) Math.random()*questions.size();
        }
        currentQuestion = questions.get(currentIndex);
        questionTextView.setText(currentQuestion.getQuestion());
    }
    public void trueButtonClicked(View view) {
        boolean playerAnswer = true;
        getOutcome(playerAnswer);
        poseQuestion();
    }

    public void falseButtonClicked(View view) {
        boolean playerAnswer = false;
        getOutcome(playerAnswer);
        poseQuestion();
    }

    private void getOutcome(boolean playerAnswer) {
        Toast message;
        if (playerAnswer==currentQuestion.getAnswer()){
            message = Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_LONG);
        }
        else {
            message = Toast.makeText(getApplicationContext(),"Incorrect!",Toast.LENGTH_LONG);
        }
        message.show();
    }
}
