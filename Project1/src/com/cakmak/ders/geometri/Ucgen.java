package com.cakmak.ders.geometri;

public class Ucgen implements Sekil{

    private  double kenarSayisi = 3;
    private double kenarUzunluk = 7;
    private String name;


    public Ucgen(){  //Default Constructor
        setName("üçgen"); // this.name = name;
        setKenarSayisi(3); // this.kenarSayisi = kenarSayisi;
    }

    public Ucgen(String name,double kenarUzunluk){ // with parameter constructor
        this.name = name;
        this.kenarUzunluk=kenarUzunluk;
    }

    @Override
    public double hesaplamalar() {
        String xx = name();
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
        return kenarUzunluk = kenarUzunluk;
    }

    public void setKenarUzunluk(double kenarUzunluk) {
        this. kenarUzunluk = kenarUzunluk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
