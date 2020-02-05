package com.akmmp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int f1,f2,fn,n;

        Scanner scan = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke-: ");
        n = scan.nextInt();

        f2 = 0;
        f1 = 1;
        fn = 1;

        for(int i = 0; i <= n; i++){
            System.out.println("nilai ke - " + i + " adalah " + fn);
            fn = f1 + f2;
            f2 = f1;
            f1 = fn;

        }


    }
}
