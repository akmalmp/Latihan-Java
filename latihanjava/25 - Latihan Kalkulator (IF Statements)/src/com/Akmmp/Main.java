package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        a operator b
        Scanner scan;
        float a,b,hasil;
        char operator;

        scan = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDEHANA =====");

        System.out.print("nilai a = ");
        a = scan.nextFloat();
        System.out.print("opeator = ");
        operator = scan.next().charAt(0);
        System.out.print("nilai b = ");
        b = scan.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        if(operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        }else if(operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.println("hasil = "+ hasil);
        }else if(operator == 'x'){
            // perkalian
            hasil = a * b;
            System.out.println("hasil = "+ hasil);
        }else if(operator == ':'){
            // pembagian
            if(b == 0){
                System.out.println("tidak bisa dibagi dengan nol");
            }else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        }else {
            System.out.println("-=-=-=-= OPERATOR TIDAK DITEMUKAN =-=-=-=-");
        }


    }
}
