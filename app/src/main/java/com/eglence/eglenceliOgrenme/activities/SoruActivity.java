package com.eglence.eglenceliOgrenme.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.eglence.eglenceliOgrenme.R;
import com.eglence.eglenceliOgrenme.model.Soru;
import com.eglence.eglenceliOgrenme.utils.SorularUtil;

public class SoruActivity extends AppCompatActivity  implements View.OnClickListener {


    Button cevap1, cevap2, cevap3, anamenu;
    TextView txt_soru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru);
        init();

    }

    private  void init(){

        cevap1 = findViewById(R.id.btn_cvp1);
        cevap2 = findViewById(R.id.btn_cvp2);
        cevap3 = findViewById(R.id.btn_cvp3);
        anamenu = findViewById(R.id.btn_soru_anamenu);
        txt_soru = findViewById(R.id.txt_soru);

        cevap1.setOnClickListener(this);
        cevap2.setOnClickListener(this);
        cevap3.setOnClickListener(this);
        anamenu.setOnClickListener(this);
        SorularUtil.soruOlustur(getApplicationContext());
        btnRestart();
        sorularıDoldur();

    }
    private void sorularıDoldur(){
        Soru soru = SorularUtil.sonrakiSoru();
        txt_soru.setText(soru.getSorusu());
        cevap1.setBackground(soru.getCevap1());
        cevap2.setBackground(soru.getCevap2());
        cevap3.setBackground(soru.getCevap3());

    }
    private  void dogruCevapKontrol(int clickedAnswer,View btnClicked){
        if(SorularUtil.cevapKontrol(clickedAnswer)){
            btnClicked.setBackground(getResources().getDrawable(R.drawable.dogru_btn));
            ikiSaniyeBekle();
        }

        else{
            btnClicked.setBackground(getResources().getDrawable(R.drawable.yanlis_btn));
            ikiSaniyeBekle();
        }
    }
    private void btnRestart(){
        cevap1.setBackgroundColor(getResources().getColor(R.color.blue));
        cevap2.setBackgroundColor(getResources().getColor(R.color.blue));
        cevap3.setBackgroundColor(getResources().getColor(R.color.blue));

    }
    private void ikiSaniyeBekle(){
        CountDownTimer countDownTimer =new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long l) {
            }
            @Override
            public void onFinish() {
                sorularıDoldur();
            }
        };
        countDownTimer.start();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_cvp1:
                dogruCevapKontrol(1,view);
                break;
            case R.id.btn_cvp2:
                dogruCevapKontrol(2,view);
                break;
            case R.id.btn_cvp3:
                dogruCevapKontrol(3,view);
                break;
            case R.id.btn_soru_anamenu:
                Intent questionActivityIntent=new Intent(getApplicationContext(),AnaActivity.class);
                startActivity(questionActivityIntent);
                finish();
                break;

        }
    }
}