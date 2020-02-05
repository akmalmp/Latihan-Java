package com.akmal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //penjumlahan dua buah array
        int[] Array1 = {2,3,5,1,4,7,8,6,8,9};
        int[] Array2 = {0,4,3,2,1,5,9,8,7,4};

        int[] arrayHasil1 = tambahArray(Array1, Array2);
        PrintArray(Array1, "Array1");
        PrintArray(Array2, "Array2");
        PrintArray(arrayHasil1, "hasil 1");

        //menggabungkan dua buah array
        int[] arrayHasil2 = new int[Array1.length + Array2.length];

        for (int i = 0; i < Array1.length; i++) {
            arrayHasil2[i] = Array1[1];
        }

        PrintArray(Array1, "Array1");
        PrintArray(Array2, "Array2");
        PrintArray(arrayHasil1, "hasil 1");

        for (int i = 0; i < Array2.length; i++) {
            arrayHasil2[i + Array1.length] = Array2[i];
        }

        PrintArray(Array1, "Array1");
        PrintArray(Array2, "Array2");
        PrintArray(arrayHasil1, "hasil 1");

        // sorting reverse, mengurutkan tapi kebalik
        PrintArray(Array1, "array 1");
        reverse(Array1);
        PrintArray(Array1, "reverse 1");

        PrintArray(Array2, "array 2");
        reverse2(Array2);
        PrintArray(Array2, "reverse 2");
    }

    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2 ; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static int[] tambahArray(int[] ArrayInt1, int[] ArrayInt2){
        int[] Arrayhasil = new int[ArrayInt1.length];
        for (int i = 0; i < ArrayInt1.length; i++) {
            Arrayhasil[i] = ArrayInt1[i] + ArrayInt2[i];
        }
        return Arrayhasil;
    }

    private static void PrintArray(int[] Array, String massage){
        System.out.println(massage + " = " + Arrays.toString(Array));
    }
}
