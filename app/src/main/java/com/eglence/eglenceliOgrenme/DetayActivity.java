package com.eglence.eglenceliOgrenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetayActivity extends AppCompatActivity implements View.OnClickListener {

    Button anamenu,ses,geri,ileri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        init();
    }
    private void init(){
        anamenu =findViewById(R.id.btn_anamenu);
        ses =findViewById(R.id.btn_ses);
        geri =findViewById(R.id.btn_geri);
        ileri =findViewById(R.id.btn_ileri);

        anamenu.setOnClickListener(this);
        ses.setOnClickListener(this);
        geri.setOnClickListener(this);
        ileri.setOnClickListener(this);

    }
    public void anaMenuDon(){
        Intent nextPageActivity=new Intent(getApplicationContext(),AnaActivity.class);
        startActivity(nextPageActivity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_anamenu:
               anaMenuDon();
                finish();
                break;
            case R.id.btn_ses:

                break;
            case R.id.btn_geri:

                break;
            case R.id.btn_ileri:

                break;
        }
    }
}