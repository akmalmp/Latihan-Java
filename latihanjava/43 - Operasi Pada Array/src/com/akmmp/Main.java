package com.akmmp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        //mengubah array menjadi string
        System.out.println("\nMengubah Array menjadi String\n=============");
        PrintArray(array1);

        //mengkopi array
        System.out.println("\nMengkopi Array\n=============");
        int[] array2 = new int[5];
        PrintArray(array1);
        PrintArray(array2);
        System.out.println("\nmengkopi dengan loop");
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }
        PrintArray(array1);
        System.out.println(array1);
        PrintArray(array2);
        System.out.println(array2);

        System.out.println("\nMengkopi dengan copyOf");
        int[] array3 = Arrays.copyOf(array1, 5);
        PrintArray(array1);
        System.out.println(array1);
        PrintArray(array3);
        System.out.println(array3);

        System.out.println("\nmengkopi dengan copyOfRange");
        int[] array4 = Arrays.copyOfRange(array1, 2, 5);
        PrintArray(array1);
        System.out.println(array1);
        PrintArray(array4);
        System.out.println(array4);

        //fill array
        System.out.println("\nFill Array\n=============");
        int[] array5 = new int[10];
        PrintArray(array5);
        Arrays.fill(array5,5);
        PrintArray(array5);

        //komparasi array
        System.out.println("\nKomparasi Array\n=============");
        int[] array6 = {1,2,3,4,5};
        int[] array7 = {1,2,3,4,5};

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(array6,array7));

        if (Arrays.equals(array6,array7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }

        System.out.println("\nmengecek array mana yang lebih besar");
        System.out.println(Arrays.compare(array6,array7));

        System.out.println("\nmengecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(array6,array7));

        //sort array
        System.out.println("\nsort array\n=============");
        int[] array8 = {4,2,1,3,5,6,8,7,9};
        PrintArray(array8);
        Arrays.sort(array8);
        PrintArray(array8);

        //search array
        System.out.println("\nsearch array\n=============");
        int angka = 1;
        int posisi = Arrays.binarySearch(array8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);



    }

    private static void PrintArray(int[] dataarray){
        System.out.println("array = " + Arrays.toString(dataarray));
    }
}








