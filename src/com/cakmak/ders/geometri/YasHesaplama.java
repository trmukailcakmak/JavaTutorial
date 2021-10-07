package com.cakmak.ders.geometri;

public class YasHesaplama implements Sekil {

    private int Bugun = 2021;
    private int Dt = 2020;


    @Override
    public double hesaplamalar() {
        return Bugun-Dt;
    }

    @Override
    public String name() {
        return null;
    }
}


