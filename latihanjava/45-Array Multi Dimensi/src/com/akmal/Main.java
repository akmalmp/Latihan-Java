package com.akmal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("membuat array multidimensi");

        //cara membuat array multidimensi dengan asignments

        int[][] array1D = {
                {1, 2, 3},
                {4, 5, 6}
        };
        printArray2D(array1D);

        //membuat array multi dimensi dengan deklareasi
        //int[bari][kolom]
        int[][] arrayAngka = new int[4][5];

        printArray2D(arrayAngka);

//        //looping lengkap secara manual
//        for (int i = 0; i < arrayAngka.length; i++) {
//            System.out.print("[");
//            for (int j = 0; j < arrayAngka[i].length; j++) {
//                System.out.print(arrayAngka[i][j] + ",");
//            }
//            System.out.println("]\n");
//        }
        
        //looping dengan foreach
//        for(int[] baris: arrayAngka){
//            System.out.print("[");
//
//            for (int angka:baris) {
//                System.out.print(angka + ",");
//            }
//            System.out.println("]\n");
//        }

        int[][] array2D_2 = {
                {1,2},
                {3,4},
                {5,6}
        };
        printArray2D(array2D_2);


        int[][] array_regged = {
                {1,2,3},
                {4,5},
                {6}
        };
        printArray2D(array_regged);

    }


    private static void printArray2D ( int[][] dataArray){
        System.out.println("{\n");
        for(int[] baris: dataArray){
            System.out.print("[");
            for (int angka:baris) {

                System.out.print(angka + ",");
            }
            System.out.println("]\n");
        }
        System.out.println("}\n");
    }

}














