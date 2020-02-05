package com.akmmp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] arrayangka = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("looping standard");
        for (int i =0; i < 10; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayangka[i]);
        }

        System.out.println(arrayangka.length);//jml isi array

        //looping dengan properti dari array
        System.out.println("looping dengan properti array");

        for (int i = 0; i < arrayangka.length; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayangka[i]);

        }
        
        //looping dengan collection -> array
        System.out.println("looping dengan for each");
        for (int angka :
             arrayangka) {
            System.out.println("angka pada looping ini = " + angka);
        }

    }
}
