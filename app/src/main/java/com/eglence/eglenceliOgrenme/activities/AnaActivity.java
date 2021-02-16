package com.eglence.eglenceliOgrenme.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.eglence.eglenceliOgrenme.utils.BarGizleUtil;
import com.eglence.eglenceliOgrenme.R;

public class AnaActivity extends AppCompatActivity  implements View.OnClickListener {

    Button harfler, hayvanlar, sayilar, renkler,sorular, cikis,sekiller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana);

        init();
    }

    private void init(){

        BarGizleUtil.hideBar2(AnaActivity.this);
        harfler = findViewById(R.id.btn_harfler);
        hayvanlar = findViewById(R.id.btn_hayvanlar);
        sayilar = findViewById(R.id.btn_sayilar);
        renkler = findViewById(R.id.btn_renkler);
        sorular = findViewById(R.id.btn_sorular);
        cikis = findViewById(R.id.btn_cikis);
        sekiller = findViewById(R.id.btn_sekiller);

        harfler.setOnClickListener(this);
        hayvanlar.setOnClickListener(this);
        sayilar.setOnClickListener(this);
        renkler.setOnClickListener(this);
        sorular.setOnClickListener(this);
        cikis.setOnClickListener(this);
        sekiller.setOnClickListener(this);



    }

    public void nextActivity(int id){
        Intent questionActivityIntent=new Intent(getApplicationContext(),DetayActivity.class);
        questionActivityIntent.putExtra( "gidenId",id);
        startActivity(questionActivityIntent);
        finish();
    }

    public void startAlertDialog(){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(R.string.cikis_dikkat));
        builder.setMessage(getResources().getString(R.string.cikis_soru));
        builder.setPositiveButton(getResources().getString(R.string.cikis_evet), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                window.dismiss();
                finish();
            }
        });

        builder.setNegativeButton(getResources().getString(R.string.cikis_hayir), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface window, int i) {
                window.dismiss();
            }
        });
        builder.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_cikis:
                startAlertDialog();
                break;
            case R.id.btn_hayvanlar:
                nextActivity(hayvanlar.getId());

                break;
            case R.id.btn_sayilar:
                nextActivity(sayilar.getId());

                break;
            case R.id.btn_renkler:
                nextActivity(renkler.getId());

                break;
            case R.id.btn_sekiller:
                nextActivity(sekiller.getId());

                break;
            case R.id.btn_harfler:
                nextActivity(harfler.getId());

                break;
            case R.id.btn_sorular:
                Intent questionActivityIntent=new Intent(getApplicationContext(),SoruActivity.class);
                startActivity(questionActivityIntent);
                finish();
                break;
        }
    }


}