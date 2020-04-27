package com.example.femaleleadershipappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    TextView questionTextView;
    ArrayList<Question> questions;
    int currentIndex;
    Question currentQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questionTextView = findViewById(R.id.questionTextView);
        questions = new ArrayList<>();
        addQuestions();
        currentIndex=0;
        displayQuestion(currentIndex);
    }

    private void addQuestions() {
        questions.add(new Question("What is the president's name?",
                new String[]{"Donald Trump", "Joe Biden", "Barack Obama"},"A"));
        questions.add(new Question("",
                new String[]{"Donald Trump", "Joe Biden", "Barack Obama"},"A"));
        questions.add(new Question("What is the president's name?",
                new String[]{"Donald Trump", "Joe Biden", "Barack Obama"},"A"));
        questions.add(new Question("What is the president's name?",
                new String[]{"Donald Trump", "Joe Biden", "Barack Obama"},"A"));
    }


    public void buttonAClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if (currentQuestion.getAnswer()=="A"){
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
        else {
            currentIndex++;
        }
        displayQuestion(currentIndex);
    }

    private void displayQuestion(int currentIndex) {
        questionTextView.setText(questions.get(currentIndex).getQuestion()
                +"\n\nA) " + questions.get(currentIndex).getPossibleAnswers()[0]
                +"\n\nB) " + questions.get(currentIndex).getPossibleAnswers()[1]
                +"\n\nC) " + questions.get(currentIndex).getPossibleAnswers()[2]);
    }

    public void buttonBClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if (currentQuestion.getAnswer()=="B"){
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
        else {
            currentIndex++;
        }
        displayQuestion(currentIndex);
    }

    public void buttonCClicked(View view) {
        currentQuestion = questions.get(currentIndex);
        Toast message;
        if (currentQuestion.getAnswer()=="C"){
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
        else {
            currentIndex++;
        }
        displayQuestion(currentIndex);
    }
}
