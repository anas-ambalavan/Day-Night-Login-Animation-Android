package com.example.login_register_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    ImageView sun, moon, dayLand, nightLand;
    View daySky, nightSky;
    DayNightSwitch dayNightSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sun= findViewById(R.id.sun);
        moon = findViewById(R.id.moon);
        dayLand= findViewById(R.id.day_landscape);
        nightLand= findViewById(R.id.night_landscape);
        daySky= findViewById(R.id.day_bg);
        nightSky= findViewById(R.id.night_bg);
        dayNightSwitch= findViewById(R.id.day_night_switch);

        sun.setTranslationY(-250);
        moon.setTranslationY(300);

        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean is_night) {
                if(is_night){
                    sun.animate().translationY(250).setDuration(1300);
                    moon.animate().translationY(-200).setDuration(1300);
                    dayLand.animate().alpha(0).setDuration(1300);
                    daySky.animate().alpha(0).setDuration(1300);
                }else
                {
                    sun.animate().translationY(-250).setDuration(1300);
                    moon.animate().translationY(300).setDuration(1300);
                    dayLand.animate().alpha(1).setDuration(1300);
                    daySky.animate().alpha(1).setDuration(1300);

                }
            }
        });

    }
}