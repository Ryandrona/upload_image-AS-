package com.example.manager_user.Login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.manager_user.R;

public class SplashActivity extends AppCompatActivity {
        private static int SPLASH_TIME_OUT  = 3000;
        ImageView splash_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        splash_image = findViewById(R.id.SplashScreenImage);
        Animation splash_screen;
        splash_screen = AnimationUtils.loadAnimation(this, R.anim.side_slide);

        splash_image.setAnimation(splash_screen);

        // hide startbar android

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide(); //Ẩn ActionBar nếu muốn


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIME_OUT);




    }
}