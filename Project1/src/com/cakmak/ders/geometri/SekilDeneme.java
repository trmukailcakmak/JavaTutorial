package com.cakmak.ders.geometri;

import com.cakmak.ders.main.Main;

import java.util.Scanner;

public class SekilDeneme {

    public static void main(String[] args) {
        Ucgen ucgen1 = new Ucgen();
        System.out.println(ucgen1.name()+" cevres : "+ucgen1.hesaplamalar());
        ucgen1.setName("XXXXXUcgen");
        ucgen1.setKenarUzunluk(11);
        System.out.println(ucgen1.name()+" cevresi : "+ ucgen1.hesaplamalar());
        Ucgen ucgenX = new Ucgen("Ucgen11",7);
        System.out.println(ucgenX.name()+" cevresi : "+ucgenX.hesaplamalar());

        Besgen besgen1 = new Besgen();
        System.out.println(besgen1.name()+" cevresi : "+besgen1.hesaplamalar());
        System.out.println(besgen1.name()+" cevresi : "+besgen1.hesaplamalar());

        Altigen altigen1 = new Altigen();
        System.out.println(altigen1.name()+" cevresi : "+altigen1.hesaplamalar());
        System.out.println(altigen1.name()+" cevresi : "+altigen1.hesaplamalar());

        Sekil ucgen2 = new Ucgen();
        System.out.println(ucgen2.name()+" cevresi : "+ucgen2.hesaplamalar());
        System.out.println(ucgen2.name()+" cevresi : "+ucgen2.hesaplamalar());

        Sekil besgen2 = new Besgen();
        System.out.println(besgen2.name()+"Besgen cevresi : "+besgen2.hesaplamalar());
        System.out.println(besgen2.name()+"Besgen cevresi : "+besgen2.hesaplamalar());

        Sekil altigen2 = new Altigen();
        System.out.println(altigen2.name()+"Altigen cevresi : "+altigen2.hesaplamalar());
        System.out.println(altigen2.name()+"Altigen cevresi : "+altigen2.hesaplamalar());

    }
    /*public static void xxxx(int yukseklik) {

        for (int a = 1; a <= yukseklik; a++) {
            for (int i = 1; i <= yukseklik; i++) {
                System.out.print("B");
                for (int j = 1; j <= 1; j++) {
                    System.out.print("*");
                    for (int m = 1; m <= 1; m++) {
                        System.out.print("B");
                    }
                }
            }
            System.out.println();
            System.out.print("B");
        }
    }

    public static void yildizBoslukCiz(int boyut) {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print("B");
                } else {
                    if (j % 2 == 0)
                        System.out.print("B");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }*/

    /*
    AAAAABBBAA
    aaaaabbbaa
     */


    }


