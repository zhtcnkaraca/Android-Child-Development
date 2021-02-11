package com.eglence.eglenceliOgrenme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity implements View.OnClickListener {

    Button anamenu,ses,geri,ileri;
    TextView isim;
    Boolean status= true;
    ImageView resim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        init();
    }
    private void init(){
        anamenu =findViewById(R.id.btn_detay_anamenu);
        ses =findViewById(R.id.btn_detay_ses);
        geri =findViewById(R.id.btn_detay_geri);
        ileri =findViewById(R.id.btn_detay_ileri);
        isim =findViewById(R.id.txt_detay_isim);
        resim = findViewById(R.id.img_detay_resim);

        anamenu.setOnClickListener(this);
        ses.setOnClickListener(this);
        geri.setOnClickListener(this);
        ileri.setOnClickListener(this);



        OgrenUtil.createOgrens(getApplicationContext());
        ItemGetir();
    }
    public void anaMenuDon(){
        Intent nextPageActivity=new Intent(getApplicationContext(),AnaActivity.class);
        startActivity(nextPageActivity);
    }

    public void ItemGetir(){
        String categoryName =PrefUtil.getCategory((getApplicationContext()));
        status=true;
        while (status == true){
            Ogren ogren = OgrenUtil.getNextItem();
            if(categoryName.equals(ogren.getKategori())){
                status= false;
                isim.setText(ogren.getAdi());
                resim.setImageDrawable(ogren.getFotograf());

            }
        }
    }
    public void ItemGeriGetir(){
        String categoryName =PrefUtil.getCategory((getApplicationContext()));
        status=true;
        while (status == true){
            Ogren ogren = OgrenUtil.getPreviousItem();
            if(categoryName.equals(ogren.getKategori())){
                status= false;
                isim.setText(ogren.getAdi());
                resim.setImageDrawable(ogren.getFotograf());

            }
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_detay_anamenu:
               anaMenuDon();
                finish();
                break;
            case R.id.btn_detay_ses:

                break;
            case R.id.btn_detay_geri:
                ItemGeriGetir();
                break;
            case R.id.btn_detay_ileri:
                ItemGetir();
                break;
        }
    }
}