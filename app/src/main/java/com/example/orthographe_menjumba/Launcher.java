package com.example.orthographe_menjumba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Launcher extends AppCompatActivity {

    TextView txtTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimary));

        txtTest = (TextView) findViewById(R.id.txtTest);
        presenterApp();
    }


    private void presenterApp() {

        Animation animationWelcome = AnimationUtils.loadAnimation( getApplicationContext(), R.anim.anim_welcome );

        txtTest.setAnimation( animationWelcome );


        animationWelcome.setAnimationListener( new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

                Log.d("onAnimationStart","on");

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Log.d("onAnimationEnd","on");

                startActivity( new android.content.Intent( getApplicationContext(), MainActivity.class ) );
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

                Log.d("onAnimationRepeat","on");

            }
        } );
    }

}