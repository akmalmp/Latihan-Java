package com.Akmmp;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        String kalimat = "saya suka makan pisang";

        //mengambil komponen dari string
        System.out.println(kalimat.charAt(5));
        System.out.print("\n");

        // substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);
        System.out.print("\n");

        //concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);
        System.out.println("");


        kata = kata + " cireng";
        System.out.println(kata);

        // concat dengan non String
        int jml = 20;
        String kalimat3 = kata + " " + jml; // casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jml);
        System.out.println("");

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        System.out.println("");

        //replace
        String kalimat4 = kalimat.replace("pisang","combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);
        System.out.println("");

        //comparasi
        String motor1 = "cbr 250r";
        String motor2 = "harley davidson";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));
        System.out.println("");

        // equality (persamaan)

        String kataInput = "test"; // ini ada di string pool
        //String kataInput = new String("test");
        String kataTest = "test"; // ini adlah di string pool

        System.out.println("persamaan pada lpkasi string pool");


        Scanner scan = new Scanner(System.in);
        System.out.print("\nmengambil input string dari user: ");
        kataInput = scan.next(); // tidak di string pool
        System.out.println("ini adalah input user: " + kataInput);

        if (kataInput.equals(kataTest)){
            System.out.println("sama");
        }else {
            System.out.println("tidak sama");
        }



    }
}


















