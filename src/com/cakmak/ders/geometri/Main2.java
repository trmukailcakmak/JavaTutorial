package com.cakmak.ders.geometri;

import com.cakmak.ders.main.Main;

import java.util.Scanner;

public class Main2 {
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

    public static void yildizBoslukCizX(int boyut) {


        for (int i = 0; i < boyut ; i++) {
            System.out.print("satir "+i+" = "  );
            for (int j = 0; j < boyut ; j++) {

                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            if (j==0){
                                System.out.print("["+j+"]=x,");
                            } else if(j==(boyut-1)){
                                System.out.print("["+j+"]=y");
                            }
                            else {
                                System.out.print("["+j+"]=*,");
                            }
                        } else {

                            if (j==boyut-1){
                                System.out.print("["+j+"]=y");
                            }
                            else{
                                System.out.print("["+j+"]=B,");
                            }
                        }
                    } else {
                        if (j % 2 == 0) {

                            if (j==0){
                                System.out.print("["+j+"]=x,");
                            }
                            else if(j==(boyut-1)){
                                System.out.print("["+j+"]=y");
                            }
                            else{
                                System.out.print("["+j+"]=B,");
                            }
                        }
                        else {

                            if (j==boyut-1){
                                System.out.print("["+j+"]=y");
                            }
                            else{
                                System.out.print("["+j+"]=*,");
                            }
                        }
                    }
                }


            System.out.println();
        }

    }
}


