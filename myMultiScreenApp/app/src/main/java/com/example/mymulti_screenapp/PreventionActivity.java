package com.example.mymulti_screenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PreventionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        ArrayList<AboutItem> info = new ArrayList<AboutItem>();

        String washYourHands = "The most EFFECTIVE way to combat the spread of SARS-CoV-2 is to wash your hands. " +
                               "Regularly and thoroughly clean your hands with an alcohol-based hand rub or wash them with soap and water. " +
                               "What this does is KILL VIRUSES that may be on your hands.";
        info.add(new AboutItem("Wash Your Hands", washYourHands, R.drawable.washhands));

        String dontTouchFace = "Avoid touching your eyes, nose, or mouth. Hands touch many surfaces and can pick up viruses. " +
                               "Contaminated hands can transfer the virus to your eyes, nose, or mouth, " +
                               "whereupon it may enter your body and make you sick.";
        info.add(new AboutItem("Don't Touch Your Face", dontTouchFace, R.drawable.touchface));

        String respiratoryEtiquette = "Make sure you, and the people around you, exercise appropriate respiratory hygiene. " +
                                      "This means COVERING YOUR MOUTH and nose with your bent elbow or tissue when you cough or sneeze. " +
                                      "Dispose of any used tissues immediately. Respiratory etiquette ensures that you eliminate " +
                                      "the expulsion of infected liquid droplets.";
        info.add(new AboutItem("Practice Respiratory Etiquette", respiratoryEtiquette, R.drawable.covermouth));

        String socialDistancing = "Maintain at least 6 FEET of distance between yourself and anyone else while in public. " +
                                  "What social distancing does is prevent you from breathing in infected liquid droplets " +
                                  "that are expelled by someone who coughs or sneezes nearby.";
        info.add(new AboutItem("Maintain Social Distancing", socialDistancing, R.drawable.socialdistancing));

        String stayHome = "STAY HOME if you feel unwell. \n\nIf you are experiencing only mild symptoms " +
                          "(e.g. headache, slightly runny nose), stay home until you recover. " +
                          "Avoiding unnecessary contact with others and visits to medical facilities allows these " +
                          "facilities to operate more effectively and helps protect you and others from SARS-CoV-2. \n\n" +
                          "If you are experiencing fever, cough, or difficulty breathing, seek medical advice early and call in advance. " +
                          "This may be due to a respiratory infection and calling in advance will allow your healthcare provider to direct you " +
                          "to the right health facility while preventing possible spread of SARS-CoV-2.";
        info.add(new AboutItem("Stay Home", stayHome, R.drawable.stayhome));

        String stayInformed = "STAY INFORMED about SARS-CoV-2 and COVID-19. Follow advice given by your healthcare provider, " +
                              "your national and local public health authority or your employer on how to protect yourself and others from COVID-19. " +
                              "IF ANY OF THE INFORMATION PRESENTED HERE CONTRADICTS INFORMATION PROVIDED BY YOUR OWN HEALTH AUTHORITIES, IGNORE IT.";
        info.add(new AboutItem("Stay Informed", stayInformed, R.drawable.stayinformed));


        ListView preventionListView = findViewById(R.id.preventionListView);
        AboutAdapter aboutAdapter = new AboutAdapter(this, info);
        preventionListView.setAdapter(aboutAdapter);
    }
}
