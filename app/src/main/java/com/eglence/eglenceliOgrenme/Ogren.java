package com.eglence.eglenceliOgrenme;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;

public class Ogren {

    public Ogren(String adi, String kategori, Drawable fotograf, String ses) {
        this.adi = adi;
        this.kategori = kategori;
        this.fotograf = fotograf;
        this.ses = ses;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Drawable getFotograf() {
        return fotograf;
    }

    public void setFotograf(Drawable fotograf) {
        this.fotograf = fotograf;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    String adi;
    String kategori;
    Drawable fotograf;
    String ses;

}