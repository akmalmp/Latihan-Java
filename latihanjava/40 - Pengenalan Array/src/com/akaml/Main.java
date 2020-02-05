package com.akaml;

public class Main {
    public static void main(String[] args) {
        //assigment
//        tipe-data [] nama = {komponen}

        System.out.println("assigment array");

        int[] Arrayinteger = {5, 6, 7, 8};

        Arrayinteger[0] = 77;

        System.out.println(Arrayinteger[0]);
        System.out.println(Arrayinteger[1]);
        System.out.println(Arrayinteger[2]);
        System.out.println(Arrayinteger[3]);

        // deklarasi
        //tipedata[] nama = new int[jmlarray]

        System.out.println("deklarasi array");
        float[] arryFloat = new float[5];

        arryFloat[3] = 11;

        System.out.println(arryFloat[0]);
        System.out.println(arryFloat[1]);
        System.out.println(arryFloat[2]);
        System.out.println(arryFloat[3]);
        System.out.println(arryFloat[4]);

    }

}
