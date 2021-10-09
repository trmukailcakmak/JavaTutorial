package com.cakmak.ders.deneme;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {
        int dimension = 0;
        Scanner Giris = new Scanner(System.in);
        System.out.print("Lütfen Tek Sayı Girin (Cikis = -1) : ");
        while (dimension != -1) {

            dimension = Giris.nextInt();
            if(dimension%2==1) {
                drawX(dimension);
                drawSliceOfBaklava(dimension);
                System.out.print("Lütfen Tekrar Tek Sayı Girin(Programi Bitirmek icin -1 girin) : ");
            }
            else if(dimension!=-1){
                System.out.print("Yalnis Giris Lütfen Sadece Tek Sayı Girin : ");
            }
        }

    }

    public static void drawX(int dimension) {
        System.out.println("X CHARACTER STARTED TO BE DRAWN");
        for (int x = 1; x <= dimension; x++) {
            for (int y = 1; y <= dimension; y++) {
                if (x == y && y != (dimension - y + 1)) {
                    System.out.print("*");
                }
                if (x != y && x != (dimension - y + 1)) {
                    System.out.print(" ");
                }
                if (x == (dimension - y + 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void drawSliceOfBaklava(int size) {

        System.out.println("BAKLAVA SLICE STARTED TO BE DRAWN");

        int halfSize = (size / 2), halfSizeDown = (size / 2), halfSizeUp = (size / 2);

        for (int x = 0; x < size; x++) {

            for (int y = 0; y < size; y++) {
                if (halfSizeDown <= y && y <= halfSizeUp) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            if (x < halfSize) {
                halfSizeDown--;
                halfSizeUp++;
            } else {
                halfSizeDown++;
                halfSizeUp--;
            }

        }
    }

}
