package com.eglence.eglenceliOgrenme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;

public class GirisActivity extends AppCompatActivity {
    Integer add=300;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

       init();



    }
    private void init(){

        progressBar=findViewById(R.id.prgs_bar);
        progressBar.setMax(900);
        timer();
        progressBar.setProgress(add);
        timer();
        progressBar.setProgress(add);
        timer();
        progressBar.setProgress(add);

        Intent nextPageActivity=new Intent(getApplicationContext(),AnaActivity.class);
        startActivity(nextPageActivity);
        finish();

    }

    public void timer(){
        CountDownTimer countDownTimer =new
                CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {
                    }
                    @Override
                    public void onFinish() {




                    }
                };
        countDownTimer.start();
    }
}