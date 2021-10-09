package com.cakmak.sekil;

public class Cokgen {
    public  double ucgenCevresi(Double kenar) { // fonksiyonun implementasyonu yani fonksiyonun tanımı fonksiyonu definition
        kenar = 488.0;
        return kenar * 3;
    }
    public  double ucgenAlani(double kenar) {
        return (((kenar / 2) * Math.sqrt(3))*kenar)/2;
    }
    public  double cembercevresi(double r){
        return r*2*Math.PI;
    }
    public  double dairealani(double r) {
        return r*r*Math.PI;
    }
    public  double dikdortgencevresi(double a,double b){
        return (a+b)*2;
    }
    // function implementation
    public  double dikdortgenalani(double a,double b){

        return a*b;
    }

    public  int mehmet(){
        int a=1;
        return a;
    }

    private  void hasan(){

    }
}
