package com.akmal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int nilaiwal,nilaiakhir,total;

        Scanner scan;

        scan = new Scanner(System.in);

        System.out.print("masukan nilai awal: ");
        nilaiwal = scan.nextInt();
        System.out.print("masukan nilai akhir: ");
        nilaiakhir = scan.nextInt();

        total = 0;
//
        while (nilaiwal <= nilaiakhir){
            total = total +nilaiwal;
            System.out.println("ditambah " + nilaiwal + " menjadi " + total);
            nilaiwal++;
        }

    }
}
