package com.muhammet.entity;

public class Arac {
    // Properties - Değişkenler
    public String yakitTuru;
    public String marka;
    public String model;
    public int km;
    public String renk;
    public int yolcuKapasitesi;
    public int tekerSayisi;
    public int hiz;
    public int maxHiz=200;
    public int depolamaHacmi;
    public int yakitMiktari;
    public int motorHacmi;
    public String saseNo;
    public int mevcutVites = 0;
    public int yil;
    public boolean calisiyorMu = false;
    // Actions - Methodlar
    public void calistir(){
        calisiyorMu = true;
    }
    public void vitesArttir(){
        mevcutVites++;
    }
    public void hizlan(){
        int hizArtisi = mevcutVites;
        if(calisiyorMu) {
            if (hiz < maxHiz - hizArtisi)
                hiz += hizArtisi;
        }
        else
            System.out.println("Lütfen arabayı çalıştırınız.");
    }


}
