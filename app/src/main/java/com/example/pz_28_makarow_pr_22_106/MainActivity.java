package com.example.pz_28_makarow_pr_22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sunImageView = findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);
        ImageView clockImageView = findViewById(R.id.clock);
// анимация для вращения часов
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);
        ImageView hourImageView = findViewById(R.id.hour_hand);
// анимация для стрелки
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
// присоединяем анимацию
        hourImageView.startAnimation(hourTurnAnimation);
    }
}