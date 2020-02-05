package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // kalkulator sederhana switch case
        Scanner scan;
        float a,b,hasil;
        String operator;

        scan = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");

        System.out.print("nilai a = ");
        a = scan.nextFloat();
        System.out.print("operator = ");
        operator = scan.next();
        System.out.print("nilai b = ");
        b = scan.nextFloat();

        System.out.println("input user = " + a + " " + operator + " " + b);


        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "x":
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case ":":
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            default:
                System.out.println("operator " + operator +  "  tidak ditemukan");
        }







    }

}
