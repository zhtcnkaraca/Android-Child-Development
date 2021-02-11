package com.eglence.eglenceliOgrenme;

import android.content.Context;

import java.util.ArrayList;

public class OgrenUtil {
    static ArrayList<Ogren> ogrens = new ArrayList<>();

    static int OGREN_INDEX = 0;

    public static void createOgrens(Context context){
        //Sayılar
        Ogren question1 = new Ogren(
                context.getResources().getString(R.string.sifir_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.sifirsayisi),
                context.getResources().getResourceName(R.raw.sifirses)
        );

        Ogren question2 = new Ogren(
                context.getResources().getString(R.string.bir_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.birsayisi),
                context.getResources().getResourceName(R.raw.birses)
        );

        Ogren question3 = new Ogren(
                context.getResources().getString(R.string.iki_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.ikisayisi),
                context.getResources().getResourceName(R.raw.ikises)
        );

        Ogren question4 = new Ogren(
                context.getResources().getString(R.string.uc_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.ucsayisi),
                context.getResources().getResourceName(R.raw.ucses)
        );

        Ogren question5 = new Ogren(
                context.getResources().getString(R.string.dort_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.dortsayisi),
                context.getResources().getResourceName(R.raw.dortses)
        );

        Ogren question6 = new Ogren(
                context.getResources().getString(R.string.bes_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.bessayisi),
                context.getResources().getResourceName(R.raw.besses)
        );

        Ogren question7 = new Ogren(
                context.getResources().getString(R.string.alti_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.altisayisi),
                context.getResources().getResourceName(R.raw.altises)
        );

        Ogren question8 = new Ogren(
                context.getResources().getString(R.string.yedi_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.yedisayisi),
                context.getResources().getResourceName(R.raw.yedises)
        );

        Ogren question9 = new Ogren(
                context.getResources().getString(R.string.sekiz_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.sekizsayisi),
                context.getResources().getResourceName(R.raw.sekizses)
        );

        Ogren question10 = new Ogren(
                context.getResources().getString(R.string.dokuz_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.dokuzsayisi),
                context.getResources().getResourceName(R.raw.dokuzsesi)
        );

        Ogren question11 = new Ogren(
                context.getResources().getString(R.string.on_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.onsayisi),
                context.getResources().getResourceName(R.raw.onses)
        );

        //Hayvanlar
        Ogren question12 = new Ogren(
                context.getResources().getString(R.string.aslan_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_aslan),
                context.getResources().getResourceName(R.raw.aslanses)
        );
        Ogren question13 = new Ogren(
                context.getResources().getString(R.string.ayi_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_ayi),
                context.getResources().getResourceName(R.raw.ayises)
        );
        Ogren question14 = new Ogren(
                context.getResources().getString(R.string.at_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_at),
                context.getResources().getResourceName(R.raw.atses)
        );
        Ogren question15 = new Ogren(
                context.getResources().getString(R.string.domuz_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_domuz),
                context.getResources().getResourceName(R.raw.domuzses)
        );
        Ogren question16 = new Ogren(
                context.getResources().getString(R.string.fare_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_fare),
                context.getResources().getResourceName(R.raw.fareses)
        );
        Ogren question17 = new Ogren(
                context.getResources().getString(R.string.fil_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_fil),
                context.getResources().getResourceName(R.raw.filses)
        );
        Ogren question18 = new Ogren(
                context.getResources().getString(R.string.horoz_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_horoz),
                context.getResources().getResourceName(R.raw.horozses)
        );
        Ogren question19 = new Ogren(
                context.getResources().getString(R.string.inek_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_inek),
                context.getResources().getResourceName(R.raw.inekses)
        );
        Ogren question20 = new Ogren(
                context.getResources().getString(R.string.kaplumbaga_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kaplumbaga),
                context.getResources().getResourceName(R.raw.kaplumbagases)
        );
        Ogren question21 = new Ogren(
                context.getResources().getString(R.string.kedi_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kedi),
                context.getResources().getResourceName(R.raw.kedises)
        );
        Ogren question22 = new Ogren(
                context.getResources().getString(R.string.kirpi_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kirpi),
                context.getResources().getResourceName(R.raw.kirpises)
        );
        Ogren question23 = new Ogren(
                context.getResources().getString(R.string.koala_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_koala),
                context.getResources().getResourceName(R.raw.koalases)
        );
        Ogren question24 = new Ogren(
                context.getResources().getString(R.string.kopek_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kopek),
                context.getResources().getResourceName(R.raw.kopekses)
        );
        Ogren question25 = new Ogren(
                context.getResources().getString(R.string.kus_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kus),
                context.getResources().getResourceName(R.raw.kusses)
        );
        Ogren question26 = new Ogren(
                context.getResources().getString(R.string.maymun_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_maymun),
                context.getResources().getResourceName(R.raw.maymunses)
        );
        Ogren question27 = new Ogren(
                context.getResources().getString(R.string.panda_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_panda),
                context.getResources().getResourceName(R.raw.pandases)
        );
        Ogren question28 = new Ogren(
                context.getResources().getString(R.string.papagan_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_papagan),
                context.getResources().getResourceName(R.raw.papaganses)
        );
        Ogren question29 = new Ogren(
                context.getResources().getString(R.string.tavsan_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_tavsan),
                context.getResources().getResourceName(R.raw.tavsanses)
        );
        Ogren question30 = new Ogren(
                context.getResources().getString(R.string.timsah_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_timsah),
                context.getResources().getResourceName(R.raw.timsahses)
        );
        Ogren question31 = new Ogren(
                context.getResources().getString(R.string.zurafa_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_zurafa),
                context.getResources().getResourceName(R.raw.zurafases)
        );
        //Renkler
        Ogren question32 = new Ogren(
                context.getResources().getString(R.string.beyaz_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.beyazrenk),
                context.getResources().getResourceName(R.raw.beyaz)
        );
        Ogren question33 = new Ogren(
                context.getResources().getString(R.string.kahverengi_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.kahverengirenk),
                context.getResources().getResourceName(R.raw.kahverengi)
        );
        Ogren question34 = new Ogren(
                context.getResources().getString(R.string.kirmizi_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.kirmizirenk),
                context.getResources().getResourceName(R.raw.kirmizi)
        );
        Ogren question35 = new Ogren(
                context.getResources().getString(R.string.lacivert_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.lacivertrenk),
                context.getResources().getResourceName(R.raw.lacivert)
        );
        Ogren question36 = new Ogren(
                context.getResources().getString(R.string.mavi_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.mavirenk),
                context.getResources().getResourceName(R.raw.mavi)
        );
        Ogren question37 = new Ogren(
                context.getResources().getString(R.string.mor_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.morrenk),
                context.getResources().getResourceName(R.raw.mor)
        );
        Ogren question38 = new Ogren(
                context.getResources().getString(R.string.pembe_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.pemberenk),
                context.getResources().getResourceName(R.raw.pembe)
        );
        Ogren question39 = new Ogren(
                context.getResources().getString(R.string.sari_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.sarirenk),
                context.getResources().getResourceName(R.raw.sari)
        );
        Ogren question40 = new Ogren(
                context.getResources().getString(R.string.siyah_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.siyahrenk),
                context.getResources().getResourceName(R.raw.siyah)
        );
        Ogren question41 = new Ogren(
                context.getResources().getString(R.string.turuncu_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.turuncuses),
                context.getResources().getResourceName(R.raw.turuncu)
        );
        Ogren question42 = new Ogren(
                context.getResources().getString(R.string.yesil_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.yesilrenk),
                context.getResources().getResourceName(R.raw.yesil)
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
        ogrens.add(question12);
        ogrens.add(question13);
        ogrens.add(question14);
        ogrens.add(question15);
        ogrens.add(question16);
        ogrens.add(question17);
        ogrens.add(question18);
        ogrens.add(question19);
        ogrens.add(question20);
        ogrens.add(question21);
        ogrens.add(question22);
        ogrens.add(question23);
        ogrens.add(question24);
        ogrens.add(question25);
        ogrens.add(question26);
        ogrens.add(question27);
        ogrens.add(question28);
        ogrens.add(question29);
        ogrens.add(question30);
        ogrens.add(question31);
        ogrens.add(question32);
        ogrens.add(question33);
        ogrens.add(question34);
        ogrens.add(question35);
        ogrens.add(question36);
        ogrens.add(question37);
        ogrens.add(question38);
        ogrens.add(question39);
        ogrens.add(question40);
        ogrens.add(question41);
        ogrens.add(question42);
    }



}
