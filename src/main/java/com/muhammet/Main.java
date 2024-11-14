package com.muhammet;

import com.muhammet.entity.Marka;
import com.muhammet.entity.Model;
import com.muhammet.entity.Urun;
import com.muhammet.entity.Yorum;

public class Main {
    public static void main(String[] args) {
        /**
         * OOP - Object Oriented Programming,
         * Nesne Yönelimli Programlama
         *
         * Abstraction - Soyutlama
         * Her olguyu mümkün olduğu kadar nesneleştirmek ve soyutlamak.
         *
         * Modelleme - Sınıf İlişkisi
         *
         * Kedi canlısı -> Nesne(Object) - Entity(varlık)
         * ------
         * Properties (Props),  Değişken
         * bir varlığı oluşturan tüm özellikleri dğeişkenler ile ifade ediyoruz.
         * 4 ayağı var,
         * tüyleri var
         * bıyıkları var,
         * gözleri var
         * .......
         * bir varlığın aksiyonları vardır. bunlar ise belli görevleri yerine getirir.
         * bir varlığın aksiyonları methodlar ile tanımlanır.
         * void miyavla();
         *
         */
//        // Değişken tanımlamak.
//        int sayi;
//        Arac arac;
//        // yeni bir nesne yaratmak ve referansını atamak
//        arac = new Arac();
//        System.out.println("1. durum");
//        System.out.println("Araç çalışıyor mu...: "+ arac.calisiyorMu);
//        System.out.println("Aracın hızı..........: "+ arac.hiz);
//        arac.hizlan();
//        arac.calistir();
//        arac.hizlan();
//        System.out.println("2. durum");
//        System.out.println("Araç çalışıyor mu...: "+ arac.calisiyorMu);
//        System.out.println("Aracın hızı..........: "+ arac.hiz);
//        arac.vitesArttir();
//        arac.hizlan();
//        System.out.println("3. durum");
//        System.out.println("Araç çalışıyor mu...: "+ arac.calisiyorMu);
//        System.out.println("Aracın hızı..........: "+ arac.hiz);
//        arac.vitesArttir(); // 2
//        arac.vitesArttir(); // 3
//        arac.hizlan(); // 1+3 = 4
//        arac.hizlan(); // 4+3 = 7
//        System.out.println("4.durum");
//        System.out.println("Araç çalışıyor mu...: "+ arac.calisiyorMu);
//        System.out.println("Aracın hızı..........: "+ arac.hiz);
// 25 dakika
//        Musteri mst1 = new Musteri();
//        Musteri mst2 = new Musteri();
//
//        mst1.ad = "Muhammet";
//        mst1.soyad = "HOCA";
//        mst1.adres = "Ankara";
//
//        mst2.ad = "Deniz";
//        mst2.soyad = "TAŞKIN";
//        mst2.adres = "İzmir";
//
//        BankaHesabi bnk1 = new BankaHesabi();
//        bnk1.bankaAdi = "JavaBank";
//        bnk1.hesapNo = "2544 5566 441";
//        bnk1.iban = "TR99 0005 0005 0005 0005 12";
//        bnk1.bakiye = 125_000;
//        BankaHesabi bnk2 = new BankaHesabi();
//        bnk2.bankaAdi = "JavaBank";
//        bnk2.hesapNo = "1111 4421 982";
//        bnk2.iban = "TR01 4500 1054 3985 9863 54";
//        bnk2.bakiye = 17_541;
//        mst1.bankaHesabi = bnk1;
//        mst2.bankaHesabi = bnk2;
//
//        System.out.println("""
//                **** Banka Hesap Bilgileri ****
//                """);
//        System.out.println("1.Müşteri ad soyad....: "+ mst1.ad+ " "+ mst1.soyad);
//        System.out.println("1.Müşteri bakiye......: "+ mst1.bankaHesabi.bakiye);
//        System.out.println("------------------------------------");
//        System.out.println("2.Müşteri ad soyad....: "+ mst2.ad+ " "+ mst2.soyad);
//        System.out.println("2.Müşteri bakiye......: "+ mst2.bankaHesabi.bakiye);
//        int sayi;
//        int toplam;
//        toplam = sayi + 5;

        Urun urun = new Urun();
        urun.urunAdi = "Lenovo Yoga 7 2-In-1 AMD Ryzen 7 8840HS 16GB 1TB SSD";
        urun.stokAdedi = 20;
        urun.urunFiyat = 39_999d;

        Marka marka = new Marka();
        marka.markaAdi = "LENOVO";

        Model model = new Model();
        model.modelAdi = "Yoga 7 2-In-1";

        marka.model = model;

        urun.marka = marka;

        Yorum yorum = new Yorum();
        yorum.kullaniciAdi = "muhammet";
        yorum.aciklama = "çoğ güzel bir ürün";
        yorum.puan = 5;

        urun.yorum = yorum;

        /**
         *
         * Sosyal Medya
         * Oluşturulacak Class lar
         * --- Kullanici -> id, ad, email, avatar
         * --- Post -> kullanici (nesnesi),resim, aciklama, postTarihi, likeCount, yorum(nesne) listesi, like(nesne) listesi
         * --- Yorum -> kullanıc adı, tarih, yorum
         * --- Like --> kullanıcı adı, puan
         * -------------------------------------
         *
         *
         */


    }
}