package com.eglence.eglenceliOgrenme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;

public class GirisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

       init();
    }
    private void init(){
        timer();
    }

    public void timer(){
        CountDownTimer countDownTimer =new
                CountDownTimer(3000,1000) {
                    @Override
                    public void onTick(long l) {
                    }
                    @Override
                    public void onFinish() {
                        Intent nextPageActivity=new Intent(getApplicationContext(),AnaActivity.class);
                        startActivity(nextPageActivity);
                        finish();
                    }
                };
        countDownTimer.start();
    }
}