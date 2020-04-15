package com.example.mymulti_screenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayList<AboutItem> info = new ArrayList<AboutItem>();

        ArrayList<String> whatIsCOVID19 = new ArrayList<String>();
        whatIsCOVID19.add("Coronavirus disease 2019 (COVID-19) is the infectious disease " +
                         "caused by the most recently discovered coronavirus: the severe " +
                         "acute respiratory syndrome coronavirus 2 (SARS-CoV-2).\n");
        whatIsCOVID19.add("\nSARS-CoV-2 and COVID-19 originated in Wuhan, China in December 2019.\n");
        whatIsCOVID19.add("\nSARS-CoV-2 is among a family of various coronaviruses which are known " +
                         "to cause illnesses such as the common cold, pneumonia, severe acute " +
                         "respiratory syndrome (SARS), and Middle East respiratory syndrome (MERS).");
        info.add(new AboutItem("What is COVID-19?", whatIsCOVID19, R.drawable.virus));

        ArrayList<String> symptoms = new ArrayList<String>();
        symptoms.add("COVID-19 is a respiratory disease that will affect different people in different ways.\n");
        symptoms.add("Common symptoms include:\n\n" +
                     "\u2022Dry cough\n" +
                     "\u2022Fever\n" +
                     "\u2022Tiredness\n");
        symptoms.add("Other symptoms include:\n" +
                     "\u2022Shortness of breath\n" +
                     "\u2022Aches and pains\n" +
                     "\u2022Sore throat\n\n");
        symptoms.add("Few people will report diarrhea, nausea, or runny nose");
        info.add(new AboutItem("What are its symptoms?", symptoms, R.drawable.cough));

        ArrayList<String> highRisk = new ArrayList<String>();
        highRisk.add("The majority of those infected with COVID-19 will only experience mild symptoms " +
                     "and will recover from the disease without special treatment.\n" +
                     "\nThose at high risk for developing serious illness as a result of COVID-19 " +
                     "are older people (i.e. people above the age of 60), and those with underlying medical conditions such as:\n" +
                     "\n\u2022Cardiovascular disease\n" +
                     "\u2022Diabetes\n" +
                     "\u2022Chronic respiratory disease\n" +
                     "\u2022Cancer\n");
        info.add(new AboutItem("Who is at high risk for COVID-19?", highRisk, R.drawable.elderly));

        ArrayList<String> spread = new ArrayList<String>();
        spread.add("People contract SARS-CoV-2 either through contact with a person who is infected or through contact with the virus itself.\n" +
                   "\nSARS-CoV-2 is spread from person to person via respiratory droplets (i.e. discharge from the nose or mouth when an " +
                   "infected person coughs, sneezes, or exhales). Droplets that contain the virus can land on objects and surfaces. " +
                   "People can catch the virus either by inhaling infected droplets, or by touching infected surfaces and then " +
                   "touching their eyes, nose, or mouth.");
        info.add(new AboutItem("How does it spread?",spread,R.drawable.covid));

        ListView aboutListView = findViewById(R.id.aboutListView);
        AboutAdapter aboutAdapter = new AboutAdapter(this, info);
        aboutListView.setAdapter(aboutAdapter);
    }
}
