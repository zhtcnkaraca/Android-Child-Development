package com.eglence.eglenceliOgrenme.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;

public class Ogren {

    public Ogren(String adi, int kategori, Drawable fotograf) {
        this.adi = adi;
        this.kategori = kategori;
        this.fotograf = fotograf;

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKategori() {
        return kategori;
    }

    public void setKategori(int kategori) {
        this.kategori = kategori;
    }

    public Drawable getFotograf() {
        return fotograf;
    }

    public void setFotograf(Drawable fotograf) {
        this.fotograf = fotograf;
    }


    String adi;
    int kategori;
    Drawable fotograf;


}