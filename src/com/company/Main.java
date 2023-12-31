package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int a = input.nextInt();


        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            System.out.print((i + 1) + ". gireceğiniz sayi : ");
            int sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("En büyük sayı : "+enBuyuk);
        System.out.println("En küçük sayı : "+enKucuk);
    }
}
