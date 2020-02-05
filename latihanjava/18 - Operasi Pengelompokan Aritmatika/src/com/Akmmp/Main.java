package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        int hasil =  10 / 2 + 2 * 5 ;
        System.out.println(hasil);

//        Operasi Pengelompkan
        hasil = 2 * (10 + 5);
        System.out.println(hasil);

        Scanner scan = new Scanner(System.in);
//        Perhitungan Persamaan kuadrat
        System.out.println("=-=-=-=- MENGHITUNG PERSAMAAN KUADRAT -=-=-=-=");
        int x,m,c;
        System.out.print("nilai x = ");
        x = scan.nextInt();
        System.out.print("Gradient m = ");
        m = scan.nextInt();
        System.out.print("blas c = ");
        c = scan.nextInt();
        int y = m * x * x + c;
        System.out.println("nilai y = " + y);

    }
}
