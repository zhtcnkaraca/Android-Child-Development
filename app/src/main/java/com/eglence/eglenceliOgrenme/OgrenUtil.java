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
                context.getResources().getDrawable(R.drawable.image_sifirsayisi),
                context.getResources().getResourceName(R.raw.ses_sifir)
        );

        Ogren question2 = new Ogren(
                context.getResources().getString(R.string.bir_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_birsayisi),
                context.getResources().getResourceName(R.raw.ses_bir)
        );

        Ogren question3 = new Ogren(
                context.getResources().getString(R.string.iki_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_ikisayisi),
                context.getResources().getResourceName(R.raw.ses_iki)
        );

        Ogren question4 = new Ogren(
                context.getResources().getString(R.string.uc_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_ucsayisi),
                context.getResources().getResourceName(R.raw.ses_uc)
        );

        Ogren question5 = new Ogren(
                context.getResources().getString(R.string.dort_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_dortsayisi),
                context.getResources().getResourceName(R.raw.ses_dort)
        );

        Ogren question6 = new Ogren(
                context.getResources().getString(R.string.bes_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_bessayisi),
                context.getResources().getResourceName(R.raw.ses_bes)
        );

        Ogren question7 = new Ogren(
                context.getResources().getString(R.string.alti_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_altisayisi),
                context.getResources().getResourceName(R.raw.ses_alti)
        );

        Ogren question8 = new Ogren(
                context.getResources().getString(R.string.yedi_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_yedisayisi),
                context.getResources().getResourceName(R.raw.ses_yedi)
        );

        Ogren question9 = new Ogren(
                context.getResources().getString(R.string.sekiz_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_sekizsayisi),
                context.getResources().getResourceName(R.raw.ses_sekiz)
        );

        Ogren question10 = new Ogren(
                context.getResources().getString(R.string.dokuz_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_dokuzsayisi),
                context.getResources().getResourceName(R.raw.ses_dokuz)
        );

        Ogren question11 = new Ogren(
                context.getResources().getString(R.string.on_sayi),
                context.getResources().getString(R.string.sayilarkategori),
                context.getResources().getDrawable(R.drawable.image_onsayisi),
                context.getResources().getResourceName(R.raw.ses_on)
        );

        //Hayvanlar
        Ogren question12 = new Ogren(
                context.getResources().getString(R.string.aslan_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_aslan),
                context.getResources().getResourceName(R.raw.ses_aslan)
        );
        Ogren question13 = new Ogren(
                context.getResources().getString(R.string.ayi_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_ayi),
                context.getResources().getResourceName(R.raw.ses_ayi)
        );
        Ogren question14 = new Ogren(
                context.getResources().getString(R.string.at_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_at),
                context.getResources().getResourceName(R.raw.ses_at)
        );
        Ogren question15 = new Ogren(
                context.getResources().getString(R.string.domuz_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_domuz),
                context.getResources().getResourceName(R.raw.ses_domuz)
        );
        Ogren question16 = new Ogren(
                context.getResources().getString(R.string.fare_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_fare),
                context.getResources().getResourceName(R.raw.ses_fare)
        );
        Ogren question17 = new Ogren(
                context.getResources().getString(R.string.fil_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_fil),
                context.getResources().getResourceName(R.raw.ses_fil)
        );
        Ogren question18 = new Ogren(
                context.getResources().getString(R.string.horoz_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_horoz),
                context.getResources().getResourceName(R.raw.ses_horoz)
        );
        Ogren question19 = new Ogren(
                context.getResources().getString(R.string.inek_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_inek),
                context.getResources().getResourceName(R.raw.ses_inek)
        );
        Ogren question20 = new Ogren(
                context.getResources().getString(R.string.kaplumbaga_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kaplumbaga),
                context.getResources().getResourceName(R.raw.ses_kaplumbaga)
        );
        Ogren question21 = new Ogren(
                context.getResources().getString(R.string.kedi_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kedi),
                context.getResources().getResourceName(R.raw.ses_kedi)
        );
        Ogren question22 = new Ogren(
                context.getResources().getString(R.string.kirpi_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kirpi),
                context.getResources().getResourceName(R.raw.ses_kirpi)
        );
        Ogren question23 = new Ogren(
                context.getResources().getString(R.string.koala_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_koala),
                context.getResources().getResourceName(R.raw.ses_koala)
        );
        Ogren question24 = new Ogren(
                context.getResources().getString(R.string.kopek_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kopek),
                context.getResources().getResourceName(R.raw.ses_kopek)
        );
        Ogren question25 = new Ogren(
                context.getResources().getString(R.string.kus_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_kus),
                context.getResources().getResourceName(R.raw.ses_kus)
        );
        Ogren question26 = new Ogren(
                context.getResources().getString(R.string.maymun_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_maymun),
                context.getResources().getResourceName(R.raw.ses_maymun)
        );
        Ogren question27 = new Ogren(
                context.getResources().getString(R.string.panda_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_panda),
                context.getResources().getResourceName(R.raw.ses_panda)
        );
        Ogren question28 = new Ogren(
                context.getResources().getString(R.string.papagan_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_papagan),
                context.getResources().getResourceName(R.raw.ses_papagan)
        );
        Ogren question29 = new Ogren(
                context.getResources().getString(R.string.tavsan_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_tavsan),
                context.getResources().getResourceName(R.raw.ses_tavsan)
        );
        Ogren question30 = new Ogren(
                context.getResources().getString(R.string.timsah_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_timsah),
                context.getResources().getResourceName(R.raw.ses_timsah)
        );
        Ogren question31 = new Ogren(
                context.getResources().getString(R.string.zurafa_ismi),
                context.getResources().getString(R.string.hayvanlarkategori),
                context.getResources().getDrawable(R.drawable.image_zurafa),
                context.getResources().getResourceName(R.raw.ses_zurafa)
        );
        //Renkler
        Ogren question32 = new Ogren(
                context.getResources().getString(R.string.beyaz_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_beyazrenk),
                context.getResources().getResourceName(R.raw.ses_beyaz)
        );
        Ogren question33 = new Ogren(
                context.getResources().getString(R.string.kahverengi_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_kahverengi),
                context.getResources().getResourceName(R.raw.ses_kahverengi)
        );
        Ogren question34 = new Ogren(
                context.getResources().getString(R.string.kirmizi_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_kirmizirenk),
                context.getResources().getResourceName(R.raw.ses_kirmizi)
        );
        Ogren question35 = new Ogren(
                context.getResources().getString(R.string.lacivert_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_lacivertrenk),
                context.getResources().getResourceName(R.raw.ses_lacivert)
        );
        Ogren question36 = new Ogren(
                context.getResources().getString(R.string.mavi_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_mavirenk),
                context.getResources().getResourceName(R.raw.ses_mavi)
        );
        Ogren question37 = new Ogren(
                context.getResources().getString(R.string.mor_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_morrenk),
                context.getResources().getResourceName(R.raw.ses_mor)
        );
        Ogren question38 = new Ogren(
                context.getResources().getString(R.string.pembe_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_pemberenk),
                context.getResources().getResourceName(R.raw.ses_pembe)
        );
        Ogren question39 = new Ogren(
                context.getResources().getString(R.string.sari_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_sarirenk),
                context.getResources().getResourceName(R.raw.ses_sari)
        );
        Ogren question40 = new Ogren(
                context.getResources().getString(R.string.siyah_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_siyahrenk),
                context.getResources().getResourceName(R.raw.ses_siyah)
        );
        Ogren question41 = new Ogren(
                context.getResources().getString(R.string.turuncu_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_turuncuses),
                context.getResources().getResourceName(R.raw.ses_turuncu)
        );
        Ogren question42 = new Ogren(
                context.getResources().getString(R.string.yesil_renk),
                context.getResources().getString(R.string.renkler_kategori),
                context.getResources().getDrawable(R.drawable.image_yesilrenk),
                context.getResources().getResourceName(R.raw.ses_yesil)
        );
        
        //Şekiller
        Ogren question43 = new Ogren(
                context.getResources().getString(R.string.altigen_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_altigen),
                context.getResources().getResourceName(R.raw.ses_altigen)
        );
        Ogren question44 = new Ogren(
                context.getResources().getString(R.string.besgen_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_besgen),
                context.getResources().getResourceName(R.raw.ses_besgen)
        );
        Ogren question45 = new Ogren(
                context.getResources().getString(R.string.daire_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_daire),
                context.getResources().getResourceName(R.raw.ses_daire)
        );
        Ogren question46 = new Ogren(
                context.getResources().getString(R.string.dikdortgen_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_dikdortgen),
                context.getResources().getResourceName(R.raw.ses_dikdortgen)
        );
        Ogren question47 = new Ogren(
                context.getResources().getString(R.string.dortgen_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_dortgen),
                context.getResources().getResourceName(R.raw.ses_dortgen)
        );
        Ogren question48 = new Ogren(
                context.getResources().getString(R.string.kalp_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_kalp),
                context.getResources().getResourceName(R.raw.ses_kalp)
        );
        Ogren question49 = new Ogren(
                context.getResources().getString(R.string.kare_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_kare),
                context.getResources().getResourceName(R.raw.ses_kare)
        );
        Ogren question50 = new Ogren(
                context.getResources().getString(R.string.ucgen_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_ucgen),
                context.getResources().getResourceName(R.raw.ses_ucgen)
        );
        Ogren question51 = new Ogren(
                context.getResources().getString(R.string.yildiz_isim),
                context.getResources().getString(R.string.sekiller_kategori),
                context.getResources().getDrawable(R.drawable.image_yildiz),
                context.getResources().getResourceName(R.raw.ses_yildiz)
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
        ogrens.add(question43);
        ogrens.add(question44);
        ogrens.add(question45);
        ogrens.add(question46);
        ogrens.add(question47);
        ogrens.add(question48);
        ogrens.add(question49);
        ogrens.add(question50);
        ogrens.add(question51);
    }



}
