package com.example.mymulti_screenapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayList<AboutItem> info = new ArrayList<AboutItem>();

        String whatIsCovid19 = "Coronavirus disease 2019 (COVID-19) is the infectious disease " +
                               "caused by the most recently discovered coronavirus: the severe " +
                               "acute respiratory syndrome coronavirus 2 (SARS-CoV-2).\n" +
                               "\nSARS-CoV-2 and COVID-19 originated in Wuhan, China in December 2019.\n" +
                               "\nSARS-CoV-2 is among a family of various coronaviruses which are known " +
                               "to cause illnesses such as the common cold, pneumonia, severe acute " +
                               "respiratory syndrome (SARS), and Middle East respiratory syndrome (MERS).";
        info.add(new AboutItem("What is COVID-19?", whatIsCovid19, R.drawable.virus));

        String symptoms = "COVID-19 is a respiratory disease that will affect different people in different ways.\n" +
                          "Common symptoms include:\n\n" +
                          "\u2022Dry cough\n" +
                          "\u2022Fever\n" +
                          "\u2022Tiredness\n" +
                          "Other symptoms include:\n" +
                          "\u2022Shortness of breath\n" +
                          "\u2022Aches and pains\n" +
                          "\u2022Sore throat\n\n" +
                          "Few people will report diarrhea, nausea, or runny nose.\n\n" +
                          "The incubation period for COVID-19 ranges from 1-14 days. 'Incubation period' " +
                          "refers to the time between catching the virus and beginning to have symptoms of the disease. " +
                          "That being said, you may have COVID-19 and be unaware of it.";
        info.add(new AboutItem("What are its symptoms?", symptoms, R.drawable.cough));

        String highRisk = "The majority of those infected with COVID-19 will only experience mild symptoms " +
                          "and will recover from the disease without special treatment.\n" +
                          "\nThose at high risk for developing serious illness as a result of COVID-19 " +
                          "are older people (i.e. people above the age of 60), and those with underlying medical conditions such as:\n" +
                          "\n\u2022Cardiovascular disease\n" +
                          "\u2022Diabetes\n" +
                          "\u2022Chronic respiratory disease\n" +
                          "\u2022Cancer\n";
        info.add(new AboutItem("Who is at high risk for COVID-19?", highRisk, R.drawable.elderly));

        String spread = "People contract SARS-CoV-2 either through contact with a person who is infected or through contact with the virus itself.\n" +
                        "\nSARS-CoV-2 is spread from person to person via respiratory droplets (i.e. discharge from the nose or mouth when an " +
                        "infected person coughs, sneezes, or exhales). Droplets that contain the virus can land on objects and surfaces. " +
                        "People can catch the virus either by inhaling infected droplets, or by touching infected surfaces and then " +
                        "touching their eyes, nose, or mouth.";
        info.add(new AboutItem("How does it spread?",spread,R.drawable.covid));

        ListView aboutListView = findViewById(R.id.aboutListView);
        AboutAdapter aboutAdapter = new AboutAdapter(this, info);
        aboutListView.setAdapter(aboutAdapter);
    }
}
