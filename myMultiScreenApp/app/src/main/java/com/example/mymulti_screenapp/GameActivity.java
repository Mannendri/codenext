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
    Button trueButton;
    Button falseButton;
    boolean playerAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        questionTextView = findViewById(R.id.questionTextView);
        falseButton = findViewById(R.id.falseButton);

        ArrayList<Question> questions = new ArrayList<Question>();
        addQuestions(questions);
        int currentIndex = 0;
        Toast message;
        while(true) {
            Question currentQuestion = questions.get(currentIndex);
            questionTextView.setText(currentQuestion.getQuestion());
            if (getPlayerAnswer() == currentQuestion.getAnswer()) {
                message = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_LONG);
                message.show();
            } else {
                message = Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_LONG);
                message.show();
            }
            currentIndex++;
        }
    }

    private void addQuestions(ArrayList<Question> questions) {
        questions.add(new Question("COVID-19 can be spread via 5G mobile networks.",false));
        questions.add(new Question("It is possible to recover from COVID-19",true));
        questions.add(new Question("A vaccine is going to save us from the current COVID-19 pandemic.",false));
        questions.add(new Question("Washing your hands is more effective than using hand sanitizer.",true));
    }

    private boolean getPlayerAnswer(){
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAnswer = true;
            }
        });
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAnswer = false;
            }
        });
        return playerAnswer;
    }
}
