package com.latihan;

public class Main{
    public static void main(String[] args) {

        // Operasi Aritmatika

         int x = 60;
         int y = 15;

        int hasil;

        // 1. penjumlahan

        hasil = x + y;
        System.out.println(x + " + " + y + " = " + hasil);

        // 2.pengurangan
        
        hasil = x - y;
        System.out.printf(" %d - %d = %d \n",x,y,hasil);

        // 3. Perkalian

        hasil = x * y;
        System.out.printf(" %d x %d = %d \n",x,y,hasil);
        // 4. Pembagian

        hasil = x / y;
        System.out.printf(" %d : %d = %d \n",x,y,hasil);

        float a = 65;
        float b = 42;
        float hasil2 = a / b;
        
        System.out.println(a + " / " + b + " = " + hasil2);

        // 5.Modulus

        int c = 13;
        int d = 5;

        int hasil3;

        hasil3 = c % d;
        System.out.printf(" %d %% %d = %d \n",c,d,hasil3);


    }
}