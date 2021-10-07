package com.cakmak.ders.main;


import com.cakmak.ders.geometri.*;
import com.cakmak.ders.sort.Sortable;

import java.util.Scanner;

public class Main {


    public static void yildizCiz(int boyut) {
        System.out.println("YildizCiz cagrıldı...");


    }

    public static void main(String[] args) {
        int yukseklik;
        Scanner Giris = new Scanner(System.in);
        System.out.print("yükseklik giriniz : ");
        yukseklik = Giris.nextInt();
        Main2.yildizBoslukCizX(yukseklik);
    }
       /* System.out.println("Main call edıldi.");
        yildizCiz(10);
        main2.xxxx(10);
         Scanner klavye = new Scanner(System.in);
        System.out.println("yükseklik kaç satır olsun?");
        int yukseklik = klavye.nextInt(); //yükseklik hep tek sayi olacaktir
        System.out.println("Merhaba Yenı Dünya");
        yildizCiz(yukseklik);
*/
         /*
        YasHesaplama ben1=new YasHesaplama();
        System.out.println("yaşınız : "+ ben1.hesaplamalar());





        Sortable sort = new Sortable();
        Integer[] arr1 = new Integer[]{3,200,3,40,5,6,7};
        String[]  str = new String[]{"Mehmet","Mükail","Asya","Fatma","Zeytun","Sinan"};

        Integer a = new Integer(5);
        int aPrimitive = 1;
        int birinciEleman = arr1[0];
        System.out.println("arr[0] = "+arr1[0]);
        System.out.println("arr[0] = "+arr1[0]);
        System.out.println("arr[1] = "+arr1[1]);
        System.out.println("arr[2] = "+arr1[2]);
        System.out.println("arr[3] = "+arr1[3]);
        sort.printf(arr1);
        sort.printf(str);




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
        System.out.println(altigen2.name()+"Altigen cevresi : "+altigen2.hesaplamalar());*/

}
