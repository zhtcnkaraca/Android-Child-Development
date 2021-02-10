package com.eglence.eglenceliOgrenme;

import android.content.Context;

import java.util.ArrayList;

public class OgrenUtil {
    static ArrayList<Ogren> ogrens = new ArrayList<>();

    static int OGREN_INDEX = 0;

    public static void createOgrens(Context context){
        Ogren question1 = new Ogren(
                "Sıfır",
                "Sayi",
                context.getResources().getDrawable(R.drawable.sifirsayisi),
                context.getResources().getResourceName(R.raw.sifirses)
        );

        Ogren question2 = new Ogren(
                "Bir",
                "Sayi",
                context.getResources().getDrawable(R.drawable.birsayisi),
                context.getResources().getResourceName(R.raw.birses)
        );

        Ogren question3 = new Ogren(
                "İki",
                "Sayi",
                context.getResources().getDrawable(R.drawable.ikisayisi),
                context.getResources().getResourceName(R.raw.ikises)
        );

        Ogren question4 = new Ogren(
                "Üç",
                "Sayi",
                context.getResources().getDrawable(R.drawable.ucsayisi),
                context.getResources().getResourceName(R.raw.ucses)
        );

        Ogren question5 = new Ogren(
                "Dört",
                "Sayi",
                context.getResources().getDrawable(R.drawable.dortsayisi),
                context.getResources().getResourceName(R.raw.dortses)
        );

        Ogren question6 = new Ogren(
                "Beş",
                "Sayi",
                context.getResources().getDrawable(R.drawable.bessayisi),
                context.getResources().getResourceName(R.raw.besses)
        );

        Ogren question7 = new Ogren(
                "Altı",
                "Sayi",
                context.getResources().getDrawable(R.drawable.altisayisi),
                context.getResources().getResourceName(R.raw.altises)
        );

        Ogren question8 = new Ogren(
                "Yedi",
                "Sayi",
                context.getResources().getDrawable(R.drawable.yedisayisi),
                context.getResources().getResourceName(R.raw.yedises)
        );

        Ogren question9 = new Ogren(
                "Sekiz",
                "Sayi",
                context.getResources().getDrawable(R.drawable.sekizsayisi),
                context.getResources().getResourceName(R.raw.sekizses)
        );

        Ogren question10 = new Ogren(
                "Dokuz",
                "Sayi",
                context.getResources().getDrawable(R.drawable.dokuzsayisi),
                context.getResources().getResourceName(R.raw.dokuzsesi)
        );

        Ogren question11 = new Ogren(
                "On",
                "Sayi",
                context.getResources().getDrawable(R.drawable.onsayisi),
                context.getResources().getResourceName(R.raw.onses)
        );


        ogrens.add(question1);
        ogrens.add(question2);
        ogrens.add(question3);
        ogrens.add(question4);
        ogrens.add(question5);
        ogrens.add(question6);
        ogrens.add(question7);
        ogrens.add(question8);
        ogrens.add(question9);
        ogrens.add(question10);
        ogrens.add(question11);
    }



}
