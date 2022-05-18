package com.example.orthographe_menjumba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class About extends AppCompatActivity {

    ImageButton img_btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimary));


        img_btn_back = (ImageButton) findViewById(R.id.img_btn_back);
        img_btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( About.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}