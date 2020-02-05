package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

//        program untuk menebak angka
        int nilaibenar = 6;
        int nilaitebakan;

        System.out.print("masukan nilai tebakan anda: ");
        nilaitebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda = " + nilaitebakan);

//        operasi logika
        boolean statusTebakan = (nilaitebakan == nilaibenar);
        System.out.println("tebakan anda: " + statusTebakan);

        /*

        a | b | c
        1   1   1
        1   0   0
        0   1   0
        0   0   0


         */

//        opersi aljabar boolean
        System.out.print("masukan nilai diantara 4 dan 9 : ");
        nilaitebakan = inputUser.nextInt();
        statusTebakan = (nilaitebakan > 4) && (nilaitebakan < 9);
        System.out.println("tebakan anda " + statusTebakan);



    }
}