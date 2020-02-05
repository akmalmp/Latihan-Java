package com.akmal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hasil;
        float hasilFloat;

        hasil = tambah(4, 5);
        printAngka(hasil);

        hasil = tambah(8,20,76);
        printAngka(hasil);

        hasilFloat = tambah(4.5f, 6);
        printAngka(hasilFloat);

        hasilFloat = tambah(4, 6.5f);
        printAngka(hasilFloat);

        printAngka(10);
        printAngka(10.5f);

    }
    private static int tambah(int a, int b, int c){
        return a + b + c;
    }

    private static float tambah(int a, float b){
        return a + b;
    }

    private static float tambah(float a, int b){
        return a + b;
    }

    private static int tambah(int a, int b){
        return a + b;
    }

    private static void printAngka(float angkaFloat){

        System.out.println("nilai float = " + angkaFloat);

    }

    private static void printAngka(int a){
        System.out.println("nilai = " + a);

    }

}
