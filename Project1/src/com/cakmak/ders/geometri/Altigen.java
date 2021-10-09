package com.cakmak.ders.geometri;

public class Altigen implements Sekil{
    private double kenarSayisi = 6;
    private double kenarUzunluk;
    private String name;

    public Altigen(){
        this.name="Altigen";
        this.kenarUzunluk=5;
    }

    public Altigen(String name, double kenarUzunluk){
        this.name = name;
        this.kenarUzunluk = kenarUzunluk;
    }

    @Override
    public double hesaplamalar() {
        return kenarUzunluk*kenarSayisi;
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
