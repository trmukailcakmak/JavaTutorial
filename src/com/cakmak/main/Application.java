package com.cakmak.main;

import com.cakmak.sekil.Cokgen;

import java.util.Scanner;

public class Application {

  /*  public static boolean ciftMi(int sayi) {
        System.out.println("ciftMi methodu cagrıldı");
        boolean isCift = sayi % 2 == 0;
        return isCift;
    }*/



    public static void main(String[] args) {


        Cokgen cokgen = new Cokgen();//Cokgen classından bir instance create ettim.
        Cokgen cokgen1 = new Cokgen();
        Cokgen cokgen2 = new Cokgen();
        int Baslama;
        Scanner baslama = new Scanner(System.in);
        System.out.println("üçgen kenarnı hesaplamak için 1 tuşlayın");
        System.out.println("üçgen alanini hesaplamak için 2 tuşlayın");
        System.out.println("çember çevresini hesaplamak için 3 tuşlayın");
        System.out.println("daire alanını hesaplamak için 4 tuşlayın");
        System.out.println("dikdortgen çevresi hesaplamak için 5 tuşlayın");
        System.out.println("dikdörtgen alanı hesaplamak için 6 tuşlayın");
        System.out.print("giriş : ");
        Baslama = baslama.nextInt();
        if (Baslama == 1) {
            Double input = new Double(12);
            double toplam;
            System.out.print("ucgenın kenarını gırınız :  ");
            toplam = cokgen.ucgenCevresi(input);
            System.out.println("call by value : "+input);
            System.out.println("ucgenın cevresı : " + toplam);
        }
        if (Baslama==2){
            double input;
            double alan ;
            Scanner xxx = new Scanner(System.in);
            System.out.print("üçgen kenarını gırınız : ");
            input = xxx.nextDouble();
            alan = cokgen.ucgenAlani(input);
            System.out.println("üçgen alanı " + alan);
        }
        if (Baslama==3){
            double input;
            double çevre ;
            Scanner mmm = new Scanner(System.in);
            System.out.print("çember yarıçapını giriniz : ");
            input = mmm.nextDouble();
            çevre = cokgen.cembercevresi(input);
            System.out.println("çember çevresi "+çevre);
        }
        if (Baslama==4){
            double input;
            double alan ;
            Scanner nnn = new Scanner(System.in);
            System.out.print("dairenin yarıçapını giriniz : ");
            input = nnn.nextDouble();
            alan = cokgen.dairealani(input);
            System.out.println("dairenin alanı "+alan);
        }
        if (Baslama==5){
            double cevre;
            cevre = cokgen.dikdortgencevresi(3,4);
            System.out.print("Dikdörgen çevresi : "+cevre);
        }
        if (Baslama==6){
            double alan;
            alan = cokgen.dikdortgenalani(4,5); // function call
            System.out.print("Dikdörgen alanı : "+alan);
        }


        // System.out.println("ucgenin cevresi = " + ucgenCevresi(12));

        /*
        int yas;
        int Dt;
        int sayi;

        Scanner giris = new Scanner(System.in);
        System.out.println("kişi sayısı: ");
        sayi = giris.nextInt();
        for (int i=1;i<=sayi;i++) {
            System.out.print(i+". Dt giriniz:");
            Dt = giris.nextInt();
            yas = Yh(Dt);
            System.out.println("yaşınız : " + yas);
        }
*/
  /*
        String ad;
        int sifre;
        int sayac=0;
        Scanner giris = new Scanner(System.in);
        System.out.print("adınızı girin: ");
        ad = giris.nextLine();
       for (int i=0;sayac<3;i++) {
           System.out.print("şifreyi girin:");
           sifre = giris.nextInt();

           if (sifre == 1234) {
               System.out.println("hoş geldiniz " + ad);
               break;

           } else {
               sayac++;
               System.out.println("şifre yanlış");
           }
       }
*/
  /*      int index = 1;
        while (index <= 4) {
            System.out.println("index = "+index);
            int a = index;
            System.out.println("a = "+a);
        System.out.println("index = "+index);
            index++;
        }

        String ad;
        int Sifre;

        Scanner giriş = new Scanner(System.in);
        System.out.print("Adınızı giriniz :");
        ad = giriş.nextLine();

        for (int i = 0; ; i++) {
            System.out.print("Sifre giriniz :");
            Sifre = giriş.nextInt();
            if (Sifre == 1958) {
                System.out.print("hoş geldiniz " + ad);
            } else {
                System.out.print("Şifre yanliş " + ad);
            }
        }
*/
       /* int yukseklik;
        Scanner Giriş=new Scanner(System.in);
        System.out.print("yükseklik kaç satır olsun :");
        yukseklik = Giriş.nextInt();

        if (yukseklik==1);
        System.out.println("*");

        if (yukseklik==3);
        System.out.print("*"+"**");*/

      /*  int boyut = 101;
        int sol = (boyut / 2);
        int sag = (boyut / 2);
        Scanner klawye = new Scanner(System.in);
        for (int i = 0; i < boyut; i++) {                 // for(ilklendirme(initıalize);kosul(condition);artırma(increment)
            for (int j = 0; j < boyut; j++) {
                if (sol <= j && j <= sag) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < (boyut / 2)) {
                sol = sol - 1;
                sag = sag + 1;
            } else {
                sol = sol + 1;
                sag = sag - 1;
            }
        }
        /* public static int Yh(int dt) {
        int bugun = 2021, yas = -1453;
        if (dt <= bugun) {
            yas = bugun - dt;
        } else {
            System.out.println("böyle bir tarih olamaz.");
        }
        return yas;*/

        /*
        int yükseklik = 2;
        int yarıyükseklik;
        boolean ciftMiSarti = true;
        while(ciftMiSarti){
            Scanner Giriş = new Scanner(System.in);
            System.out.print("yükseklik giriniz :");
            yükseklik = Giriş.nextInt();
            ciftMiSarti = ciftMi(yükseklik);
        }
        yarıyükseklik = yükseklik / 2 + 1;

            for (int i = 1; i <= yarıyükseklik; i++) {
                for (int j = 1; j <= yarıyükseklik - i; j++)
                    System.out.print("*");

                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print(" ");

                for (int j = 1; j <= yarıyükseklik - i; j++)
                    System.out.print("*");

                System.out.println();
            }

            for (int i = yarıyükseklik - 1; i >= 1; i--) {
                for (int j = 1; j <= yarıyükseklik - i; j++)
                    System.out.print("*");

                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print(" ");

                for (int j = 1; j <= yarıyükseklik - i; j++)
                    System.out.print("*");

                System.out.println();
            }
        }*/



    }
}