package com.eglence.eglenceliOgrenme;

import android.content.Context;

import java.util.ArrayList;

public class SorularUtil {
    static ArrayList<Soru> sorular = new ArrayList<>();

    static int SORU_INDEX = 0;

    public static void soruOlustur(Context context){
        Soru soru1 = new Soru(
                1,
                context.getResources().getString(R.string.soru1_sorusu),
                context.getResources().getDrawable(R.drawable.image_zurafa),
                context.getResources().getDrawable(R.drawable.image_aslan),
                context.getResources().getDrawable(R.drawable.image_kirpi),
                2
        );

        Soru soru2 = new Soru(
                2,
                context.getResources().getString(R.string.soru2_sorusu),
                context.getResources().getDrawable(R.drawable.image_tavsan),
                context.getResources().getDrawable(R.drawable.image_timsah),
                context.getResources().getDrawable(R.drawable.image_kirpi),
                3
        );

        Soru soru3 = new Soru(
                3,
                context.getResources().getString(R.string.soru3_sorusu),
                context.getResources().getDrawable(R.drawable.image_zurafa),
                context.getResources().getDrawable(R.drawable.image_aslan),
                context.getResources().getDrawable(R.drawable.image_kirpi),
                1
        );

        Soru soru4 = new Soru(
                4,
                context.getResources().getString(R.string.soru4_sorusu),
                context.getResources().getDrawable(R.drawable.image_aslan),
                context.getResources().getDrawable(R.drawable.image_tavsan),
                context.getResources().getDrawable(R.drawable.image_kedi),
                3
        );

        Soru soru5 = new Soru(
                5,
                context.getResources().getString(R.string.soru5_sorusu),
                context.getResources().getDrawable(R.drawable.image_ayi),
                context.getResources().getDrawable(R.drawable.image_kopek),
                context.getResources().getDrawable(R.drawable.image_at),
                2
        );

        Soru soru6 = new Soru(
                6,
                context.getResources().getString(R.string.soru6_sorusu),
                context.getResources().getDrawable(R.drawable.image_fare),
                context.getResources().getDrawable(R.drawable.image_domuz),
                context.getResources().getDrawable(R.drawable.image_panda),
                3
        );

        Soru soru7 = new Soru(
                7,
                context.getResources().getString(R.string.soru7_sorusu),
                context.getResources().getDrawable(R.drawable.image_kaplumbaga),
                context.getResources().getDrawable(R.drawable.image_timsah),
                context.getResources().getDrawable(R.drawable.image_papagan),
                1
        );

        Soru soru8 = new Soru(
                8,
                context.getResources().getString(R.string.soru8_sorusu),
                context.getResources().getDrawable(R.drawable.image_domuz),
                context.getResources().getDrawable(R.drawable.image_horoz),
                context.getResources().getDrawable(R.drawable.image_ayi),
                2
        );

        Soru soru9 = new Soru(
                9,
                context.getResources().getString(R.string.soru9_sorusu),
                context.getResources().getDrawable(R.drawable.image_inek),
                context.getResources().getDrawable(R.drawable.image_papagan),
                context.getResources().getDrawable(R.drawable.image_fil),
                3
        );

        Soru soru10 = new Soru(
                10,
                context.getResources().getString(R.string.soru10_sorusu),
                context.getResources().getDrawable(R.drawable.image_domuz),
                context.getResources().getDrawable(R.drawable.image_maymun),
                context.getResources().getDrawable(R.drawable.image_kus),
                1
        );

        Soru soru11 = new Soru(
                11,
                context.getResources().getString(R.string.soru11_sorusu),
                context.getResources().getDrawable(R.drawable.image_dortsayisi),
                context.getResources().getDrawable(R.drawable.image_ucsayisi),
                context.getResources().getDrawable(R.drawable.image_sifirsayisi),
                3
        );
        Soru soru12 = new Soru(
                12,
                context.getResources().getString(R.string.soru12_sorusu),
                context.getResources().getDrawable(R.drawable.image_bessayisi),
                context.getResources().getDrawable(R.drawable.image_onsayisi),
                context.getResources().getDrawable(R.drawable.image_altisayisi),
                2
        );
        Soru soru13 = new Soru(
                13,
                context.getResources().getString(R.string.soru13_sorusu),
                context.getResources().getDrawable(R.drawable.image_onsayisi),
                context.getResources().getDrawable(R.drawable.image_sifirsayisi),
                context.getResources().getDrawable(R.drawable.image_altisayisi),
                3
        );
        Soru soru14 = new Soru(
                14,
                context.getResources().getString(R.string.soru14_sorusu),
                context.getResources().getDrawable(R.drawable.image_birsayisi),
                context.getResources().getDrawable(R.drawable.image_dortsayisi),
                context.getResources().getDrawable(R.drawable.image_sekizsayisi),
                2
        );
        Soru soru15 = new Soru(
                15,
                context.getResources().getString(R.string.soru15_sorusu),
                context.getResources().getDrawable(R.drawable.image_dortsayisi),
                context.getResources().getDrawable(R.drawable.image_bessayisi),
                context.getResources().getDrawable(R.drawable.image_ucsayisi),
                2
        );
        Soru soru16 = new Soru(
                16,
                context.getResources().getString(R.string.soru16_sorusu),
                context.getResources().getDrawable(R.drawable.image_sekizsayisi),
                context.getResources().getDrawable(R.drawable.image_ikisayisi),
                context.getResources().getDrawable(R.drawable.image_ucsayisi),
                3
        );
        Soru soru17 = new Soru(
                17,
                context.getResources().getString(R.string.soru17_sorusu),
                context.getResources().getDrawable(R.drawable.image_yedisayisi),
                context.getResources().getDrawable(R.drawable.image_ikisayisi),
                context.getResources().getDrawable(R.drawable.image_sifirsayisi),
                2
        );
        Soru soru18 = new Soru(
                18,
                context.getResources().getString(R.string.soru18_sorusu),
                context.getResources().getDrawable(R.drawable.image_yedisayisi),
                context.getResources().getDrawable(R.drawable.image_altisayisi),
                context.getResources().getDrawable(R.drawable.image_birsayisi),
                1
        );
        Soru soru19 = new Soru(
                19,
                context.getResources().getString(R.string.soru19_sorusu),
                context.getResources().getDrawable(R.drawable.image_yedisayisi),
                context.getResources().getDrawable(R.drawable.image_dortsayisi),
                context.getResources().getDrawable(R.drawable.image_dokuzsayisi),
                3
        );
        Soru soru20 = new Soru(
                20,
                context.getResources().getString(R.string.soru20_sorusu),
                context.getResources().getDrawable(R.drawable.image_sekizsayisi),
                context.getResources().getDrawable(R.drawable.image_altisayisi),
                context.getResources().getDrawable(R.drawable.image_ucsayisi),
                1
        );
        Soru soru21 = new Soru(
                21,
                context.getResources().getString(R.string.soru21_sorusu),
                context.getResources().getDrawable(R.drawable.image_kalp),
                context.getResources().getDrawable(R.drawable.image_ucgen),
                context.getResources().getDrawable(R.drawable.image_yildiz),
                2
        );
        Soru soru22 = new Soru(
                22,
                context.getResources().getString(R.string.soru22_sorusu),
                context.getResources().getDrawable(R.drawable.image_dikdortgen),
                context.getResources().getDrawable(R.drawable.image_kare),
                context.getResources().getDrawable(R.drawable.image_ucgen),
                2
        );
        Soru soru23 = new Soru(
                23,
                context.getResources().getString(R.string.soru23_sorusu),
                context.getResources().getDrawable(R.drawable.image_kare),
                context.getResources().getDrawable(R.drawable.image_kalp),
                context.getResources().getDrawable(R.drawable.image_besgen),
                3
        );
        Soru soru24 = new Soru(
                24,
                context.getResources().getString(R.string.soru24_sorusu),
                context.getResources().getDrawable(R.drawable.image_daire),
                context.getResources().getDrawable(R.drawable.image_ucgen),
                context.getResources().getDrawable(R.drawable.image_yildiz),
                1
        );
        Soru soru25 = new Soru(
                25,
                context.getResources().getString(R.string.soru25_sorusu),
                context.getResources().getDrawable(R.drawable.image_dortgen),
                context.getResources().getDrawable(R.drawable.image_altigen),
                context.getResources().getDrawable(R.drawable.image_ucgen),
                1
        );
        Soru soru26 = new Soru(
                26,
                context.getResources().getString(R.string.soru26_sorusu),
                context.getResources().getDrawable(R.drawable.image_besgen),
                context.getResources().getDrawable(R.drawable.image_altigen),
                context.getResources().getDrawable(R.drawable.image_dikdortgen),
                2
        );
        Soru soru27 = new Soru(
                27,
                context.getResources().getString(R.string.soru27_sorusu),
                context.getResources().getDrawable(R.drawable.image_kare),
                context.getResources().getDrawable(R.drawable.image_kalp),
                context.getResources().getDrawable(R.drawable.image_daire),
                2
        );
        Soru soru28 = new Soru(
                28,
                context.getResources().getString(R.string.soru28_sorusu),
                context.getResources().getDrawable(R.drawable.image_ucgen),
                context.getResources().getDrawable(R.drawable.image_kare),
                context.getResources().getDrawable(R.drawable.image_dikdortgen),
                3
        );
        Soru soru29 = new Soru(
                29,
                context.getResources().getString(R.string.soru29_sorusu),
                context.getResources().getDrawable(R.drawable.image_yildiz),
                context.getResources().getDrawable(R.drawable.image_kare),
                context.getResources().getDrawable(R.drawable.image_altigen),
                1
        );

        Soru soru30 = new Soru(
                30,
                context.getResources().getString(R.string.soru30_sorusu),
                context.getResources().getDrawable(R.drawable.image_aharfi),
                context.getResources().getDrawable(R.drawable.image_charfi),
                context.getResources().getDrawable(R.drawable.image_kharfi),
                1
        );
        Soru soru31 = new Soru(
                31,
                context.getResources().getString(R.string.soru31_sorusu),
                context.getResources().getDrawable(R.drawable.image_jharfi),
                context.getResources().getDrawable(R.drawable.image_bharfi),
                context.getResources().getDrawable(R.drawable.image_sharfi),
                2
        );
        Soru soru32 = new Soru(
                32,
                context.getResources().getString(R.string.soru32_sorusu),
                context.getResources().getDrawable(R.drawable.image_s2harfi),
                context.getResources().getDrawable(R.drawable.image_charfi),
                context.getResources().getDrawable(R.drawable.image_c2harfi),
                2
        );
        Soru soru33 = new Soru(
                33,
                context.getResources().getString(R.string.soru33_sorusu),
                context.getResources().getDrawable(R.drawable.image_kharfi),
                context.getResources().getDrawable(R.drawable.image_zharfi),
                context.getResources().getDrawable(R.drawable.image_c2harfi),
                3
        );Soru soru34 = new Soru(
                34,
                context.getResources().getString(R.string.soru34_sorusu),
                context.getResources().getDrawable(R.drawable.image_mharfi),
                context.getResources().getDrawable(R.drawable.image_nharfi),
                context.getResources().getDrawable(R.drawable.image_dharfi),
                3
        );
        Soru soru35 = new Soru(
                35,
                context.getResources().getString(R.string.soru35_sorusu),
                context.getResources().getDrawable(R.drawable.image_eharfi),
                context.getResources().getDrawable(R.drawable.image_jharfi),
                context.getResources().getDrawable(R.drawable.image_dharfi),
                1
        );
        Soru soru36 = new Soru(
                36,
                context.getResources().getString(R.string.soru36_sorusu),
                context.getResources().getDrawable(R.drawable.image_eharfi),
                context.getResources().getDrawable(R.drawable.image_fharfi),
                context.getResources().getDrawable(R.drawable.image_dharfi),
                2
        );
        Soru soru37 = new Soru(
                37,
                context.getResources().getString(R.string.soru37_sorusu),
                context.getResources().getDrawable(R.drawable.image_dharfi),
                context.getResources().getDrawable(R.drawable.image_zharfi),
                context.getResources().getDrawable(R.drawable.image_gharfi),
                3
        );
        Soru soru38 = new Soru(
                38,
                context.getResources().getString(R.string.soru38_sorusu),
                context.getResources().getDrawable(R.drawable.image_hharfi),
                context.getResources().getDrawable(R.drawable.image_g2harfi),
                context.getResources().getDrawable(R.drawable.image_mharfi),
                1
        );
        Soru soru39 = new Soru(
                39,
                context.getResources().getString(R.string.soru39_sorusu),
                context.getResources().getDrawable(R.drawable.image_rharfi),
                context.getResources().getDrawable(R.drawable.image_jharfi),
                context.getResources().getDrawable(R.drawable.image_charfi),
                2
        );

        Soru soru40 = new Soru(
                40,
                context.getResources().getString(R.string.soru40_sorusu),
                context.getResources().getDrawable(R.drawable.image_beyazrenk),
                context.getResources().getDrawable(R.drawable.image_kirmizirenk),
                context.getResources().getDrawable(R.drawable.image_sarirenk),
                1
        );
        Soru soru41 = new Soru(
                41,
                context.getResources().getString(R.string.soru41_sorusu),
                context.getResources().getDrawable(R.drawable.image_lacivertrenk),
                context.getResources().getDrawable(R.drawable.image_kahverengi),
                context.getResources().getDrawable(R.drawable.image_morrenk),
                2
        );
        Soru soru42 = new Soru(
                42,
                context.getResources().getString(R.string.soru42_sorusu),
                context.getResources().getDrawable(R.drawable.image_lacivertrenk),
                context.getResources().getDrawable(R.drawable.image_morrenk),
                context.getResources().getDrawable(R.drawable.image_yesilrenk),
                1
        );
        Soru soru43 = new Soru(
                43,
                context.getResources().getString(R.string.soru43_sorusu),
                context.getResources().getDrawable(R.drawable.image_morrenk),
                context.getResources().getDrawable(R.drawable.image_beyazrenk),
                context.getResources().getDrawable(R.drawable.image_mavirenk),
                3
        );
        Soru soru44 = new Soru(
                44,
                context.getResources().getString(R.string.soru44_sorusu),
                context.getResources().getDrawable(R.drawable.image_morrenk),
                context.getResources().getDrawable(R.drawable.image_kirmizirenk),
                context.getResources().getDrawable(R.drawable.image_pemberenk),
                1
        );
        Soru soru45 = new Soru(
                45,
                context.getResources().getString(R.string.soru45_sorusu),
                context.getResources().getDrawable(R.drawable.image_yesilrenk),
                context.getResources().getDrawable(R.drawable.image_pemberenk),
                context.getResources().getDrawable(R.drawable.image_kirmizirenk),
                2
        );
        Soru soru46 = new Soru(
                46,
                context.getResources().getString(R.string.soru46_sorusu),
                context.getResources().getDrawable(R.drawable.image_sarirenk),
                context.getResources().getDrawable(R.drawable.image_pemberenk),
                context.getResources().getDrawable(R.drawable.image_turuncu),
                1
        );
        Soru soru47 = new Soru(
                47,
                context.getResources().getString(R.string.soru47_sorusu),
                context.getResources().getDrawable(R.drawable.image_siyahrenk),
                context.getResources().getDrawable(R.drawable.image_lacivertrenk),
                context.getResources().getDrawable(R.drawable.image_yesilrenk),
                1
        );
        Soru soru48 = new Soru(
                48,
                context.getResources().getString(R.string.soru48_sorusu),
                context.getResources().getDrawable(R.drawable.image_yildiz),
                context.getResources().getDrawable(R.drawable.image_siyahrenk),
                context.getResources().getDrawable(R.drawable.image_pemberenk),
                1
        );Soru soru49 = new Soru(
                49,
                context.getResources().getString(R.string.soru49_sorusu),
                context.getResources().getDrawable(R.drawable.image_yesilrenk),
                context.getResources().getDrawable(R.drawable.image_pemberenk),
                context.getResources().getDrawable(R.drawable.image_turuncu),
                1
        );



        sorular.add(soru1);
        sorular.add(soru2);
        sorular.add(soru3);
        sorular.add(soru4);
        sorular.add(soru5);
        sorular.add(soru6);
        sorular.add(soru7);
        sorular.add(soru8);
        sorular.add(soru9);
        sorular.add(soru10);
        sorular.add(soru11);
        sorular.add(soru12);
        sorular.add(soru13);
        sorular.add(soru14);
        sorular.add(soru15);
        sorular.add(soru16);
        sorular.add(soru17);
        sorular.add(soru18);
        sorular.add(soru19);
        sorular.add(soru20);
        sorular.add(soru21);
        sorular.add(soru22);
        sorular.add(soru23);
        sorular.add(soru24);
        sorular.add(soru25);
        sorular.add(soru26);
        sorular.add(soru27);
        sorular.add(soru28);
        sorular.add(soru29);
        sorular.add(soru30);
        sorular.add(soru31);
        sorular.add(soru32);
        sorular.add(soru33);
        sorular.add(soru34);
        sorular.add(soru35);
        sorular.add(soru36);
        sorular.add(soru37);
        sorular.add(soru38);
        sorular.add(soru39);
        sorular.add(soru40);
        sorular.add(soru41);
        sorular.add(soru42);
        sorular.add(soru43);
        sorular.add(soru44);
        sorular.add(soru45);
        sorular.add(soru46);
        sorular.add(soru47);
        sorular.add(soru48);
        sorular.add(soru49);



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
