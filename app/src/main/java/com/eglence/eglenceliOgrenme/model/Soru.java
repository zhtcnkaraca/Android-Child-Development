package com.eglence.eglenceliOgrenme.model;

import android.graphics.drawable.Drawable;

public class Soru {

    public Soru(int id, String sorusu, Drawable cevap1, Drawable cevap2, Drawable cevap3, int dogruCevap) {
        this.id = id;
        this.sorusu = sorusu;
        this.cevap1 = cevap1;
        this.cevap2 = cevap2;
        this.cevap3 = cevap3;
        this.dogruCevap = dogruCevap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSorusu() {
        return sorusu;
    }

    public void setSorusu(String sorusu) {
        this.sorusu = sorusu;
    }

    public Drawable getCevap1() {
        return cevap1;
    }

    public void setCevap1(Drawable cevap1) {
        this.cevap1 = cevap1;
    }

    public Drawable getCevap2() {
        return cevap2;
    }

    public void setCevap2(Drawable cevap2) {
        this.cevap2 = cevap2;
    }

    public Drawable getCevap3() {
        return cevap3;
    }

    public void setCevap3(Drawable cevap3) {
        this.cevap3 = cevap3;
    }

    public int getDogruCevap() {
        return dogruCevap;
    }

    public void setDogruCevap(int dogruCevap) {
        this.dogruCevap = dogruCevap;
    }

    int id;
    String sorusu;
    Drawable cevap1;
    Drawable cevap2;
    Drawable cevap3;
    int dogruCevap;


}
