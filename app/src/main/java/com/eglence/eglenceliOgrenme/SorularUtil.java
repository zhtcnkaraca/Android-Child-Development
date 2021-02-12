package com.eglence.eglenceliOgrenme;

import android.content.Context;

import java.util.ArrayList;

public class SorularUtil {
    static ArrayList<Soru> sorular = new ArrayList<>();

    static int SORU_INDEX = 0;

    public static void soruOlustur(Context context){



    }

    public static Soru sonrakiSoru(){
        if(SORU_INDEX<sorular.size()-1){
            SORU_INDEX++;
        }
        else {
            SORU_INDEX = 0;
        }
        return sorular.get(SORU_INDEX);
    }

    public static Boolean cevapKontrol(int answer){
        if(sorular.get(SORU_INDEX).getDogruCevap()==answer){
            return true;
        }
        else {
            return false;
        }
    }
}
