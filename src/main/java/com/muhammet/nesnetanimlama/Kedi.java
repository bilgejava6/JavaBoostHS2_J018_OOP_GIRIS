package com.muhammet.nesnetanimlama;

public class Kedi {
    /**
     * Kedi yi var eden özellikleri değişkenlerle oluşturulur
     * State-> attribute, property
     * bir nesnenin durumunu tutan bilgi tutuculara (DEĞİŞKEN) denir.
     */
    String tur;
    String cins;
    String ad;
    String tuyRengi;
    String solGozRengi;
    String sagGozRengi;
    double boy;
    double agirlik;
    int ayakSayisi;
    int kuyrukUzunlugu;
    /**
     * 0- uyuyor
     * 1- uyanık ayakta
     * 2- uyanık yürüyor
     * 3- uyanık koşuyor
     * 4- uyanık yatıyor.
     */
    int hareketDurumu;
    // kedinin açlık durumu
    boolean acMi;
    int yas;
    int hizi= 0;

    /**
     * Varlıkların aksiyonları, methodlar ile tanımlanır.
     */
    public void uyandir(){
        if(hareketDurumu==0)
            hareketDurumu=1;
    }
    public void yemekYe(){
        System.out.println("hayvan beslendi.");
        acMi = false;
    }

    public void hizlan(){
        hizi += 2;
        if(hizi>10)
            hareketDurumu = 3;
    }


}
