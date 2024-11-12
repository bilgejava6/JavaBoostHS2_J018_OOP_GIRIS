package com.muhammet.entity;

public class Arac {
    // Properties - Değişkenler
    String yakitTuru;
    String marka;
    String model;
    int km;
    String renk;
    int yolcuKapasitesi;
    int tekerSayisi;
    int hiz;
    int maxHiz;
    int depolamaHacmi;
    int yakitMiktari;
    int motorHacmi;
    String saseNo;
    int vitesSayisi;
    int mevcutVites = 0;
    int yil;
    boolean calisiyorMu = false;
    // Actions - Methodlar
    public void calistir(){
        calisiyorMu = true;
    }
    public void vitesArttir(){
        mevcutVites++;
    }
    public void hizlan(){
        int hizArtisi = mevcutVites;
        if(calisiyorMu)
            if(hiz< maxHiz-hizArtisi)
            hiz += hizArtisi;
        else
            System.out.println("Lütfen arabayı çalıştırınız.");
    }


}
