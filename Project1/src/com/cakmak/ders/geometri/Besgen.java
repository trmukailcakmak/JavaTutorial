package com.cakmak.ders.geometri;

public class Besgen implements Sekil{
    private double kenarSayisi = 5;
    private double kenarUzunluk;
    private String name;

    public Besgen(){
        this.name="Besgen";
        this.kenarUzunluk=5;
    }

    public Besgen(String name,double kenarUzunluk){
        this.name = name;
        this.kenarUzunluk = kenarUzunluk;
    }


    @Override
    public double hesaplamalar() {
        return this.kenarUzunluk * this.kenarSayisi;
    }

    @Override
    public String name() {
        return this.name;
    }

    public double getKenarSayisi() {
        return kenarSayisi;
    }

    public void setKenarSayisi(double kenarSayisi) {
        this.kenarSayisi = kenarSayisi;
    }

    public double getKenarUzunluk() {
        return kenarUzunluk;
    }

    public void setKenarUzunluk(double kenarUzunluk) {
        this.kenarUzunluk = kenarUzunluk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
