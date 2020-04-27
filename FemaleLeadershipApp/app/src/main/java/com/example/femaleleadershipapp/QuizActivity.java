package com.example.femaleleadershipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    TextView questionTextView;
    int currentIndex;
    Question currentQuestion;
    ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionTextView = findViewById(R.id.questionTextView);
        questions = new ArrayList<Question>();
        addQuestions();
        currentIndex=0;
        questionTextView.setText(questions.get(0).getQuestion()
                                 +"\n\nA) " + questions.get(0).getPossibleAnswers()[0]
                                 +"\n\nB) " + questions.get(0).getPossibleAnswers()[1]
                                 +"\n\nC) " + questions.get(0).getPossibleAnswers()[2]);
    }

    private void addQuestions() {
        questions.add(new Question("What is the president's name?",
                      new String[]{"Donald Trump", "Joe Biden", "Barack Obama"},"A"));
        questions.add(new Question("What is 2+2?",
                new String[]{"5", "22", "4"},"C"));
        questions.add(new Question("What day is it today?",
                new String[]{"Tuesday", "Monday", "Sunday"},"C"));
    }

    public void buttonAClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if(currentQuestion.getAnswer()=="A"){
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
        questionTextView.setText(questions.get(currentIndex).getQuestion()
                +"\n\nA) " + questions.get(currentIndex).getPossibleAnswers()[0]
                +"\n\nB) " + questions.get(currentIndex).getPossibleAnswers()[1]
                +"\n\nC) " + questions.get(currentIndex).getPossibleAnswers()[2]);
    }

    public void buttonBClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if(currentQuestion.getAnswer()=="B"){
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
        questionTextView.setText(questions.get(currentIndex).getQuestion()
                +"\n\nA) " + questions.get(currentIndex).getPossibleAnswers()[0]
                +"\n\nB) " + questions.get(currentIndex).getPossibleAnswers()[1]
                +"\n\nC) " + questions.get(currentIndex).getPossibleAnswers()[2]);
    }

    public void buttonCClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if(currentQuestion.getAnswer()=="C"){
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
        questionTextView.setText(questions.get(currentIndex).getQuestion()
                +"\n\nA) " + questions.get(currentIndex).getPossibleAnswers()[0]
                +"\n\nB) " + questions.get(currentIndex).getPossibleAnswers()[1]
                +"\n\nC) " + questions.get(currentIndex).getPossibleAnswers()[2]);
    }
}
