package com.eglence.eglenceliOgrenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnaActivity extends AppCompatActivity {

    Button harfler, hayvanlar, sayilar, renkler,sorular, cikis,sekiller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana);

        init();
    }

    private void init(){
        harfler = findViewById(R.id.btn_harfler);
        hayvanlar = findViewById(R.id.btn_hayvanlar);
        sayilar = findViewById(R.id.btn_sayilar);
        renkler = findViewById(R.id.btn_renkler);
        sorular = findViewById(R.id.btn_sorular);
        cikis = findViewById(R.id.btn_cikis);
        sekiller = findViewById(R.id.btn_sekiller);

        harfler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPageActivity=new Intent(getApplicationContext(),DetayActivity.class);
                startActivity(nextPageActivity);
                finish();
            }
        });

        hayvanlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPageActivity=new Intent(getApplicationContext(),DetayActivity.class);
                startActivity(nextPageActivity);
                finish();
            }
        });

    }


}