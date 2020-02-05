package com.akmmp;

import java.util.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array_2D = {
                {1,2,3},
                {4,5}
        };
        System.out.println(array_2D);
        System.out.println(Arrays.deepToString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);

        System.out.println(Arrays.deepToString(array_2D));
        System.out.println("\n");

        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e'};

        char[][] arrayCha_2D = {
                array_char1,
                array_char2
        };

        System.out.println(arrayCha_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(array_2D) );



    }
}

