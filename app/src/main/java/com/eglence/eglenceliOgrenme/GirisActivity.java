package com.eglence.eglenceliOgrenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class GirisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

       init();
    }
    private void init(){

        BarGizleUtil.hideBar2(GirisActivity.this);
        timer();
    }


    public void timer(){
        CountDownTimer countDownTimer =new
                CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {
                    }
                    @Override
                    public void onFinish() {
                        OgrenUtil.createOgrens(getApplicationContext());
                        Ogren ogren = OgrenUtil.getNextItem();
                        Intent nextPageActivity=new Intent(getApplicationContext(),AnaActivity.class);
                        startActivity(nextPageActivity);
                        finish();
                    }
                };
        countDownTimer.start();
    }


}