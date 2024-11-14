package com.muhammet.entity;

public class Musteri {
    /**
     * Bir banka için müşteriye ait tutulması gerekli olan tüm bilgiliri içeren
     * müşteri sınıfını oluşturunuz.
     * Ayrıca bir bankahesabına ait bilgileri içeren BankaHesabı sınıfını oluşturuz.
     * DİKKAT!!!!
     * her müşterinin bir banka hesabı olacaktır bu nedenle müşteriye banka hesabı ekleyiniz.
     * tanımlamalar bittikten sonra, en az 2 müşteri ve 2 bankahesabı tanımlayıp
     * ekrana çıktı verecek şekilde özelliklerini giriniz.
     */
    public String ad;
    public String soyad;
    public String adres;
    public String telefon;
    public Long dogumTarihi;
    public String tcKimlik;
    public String anneKizlikSoyadi;
    public String musteriNo;
    public String resim;
    public String meslek;
    public BankaHesabi bankaHesabi;
}
