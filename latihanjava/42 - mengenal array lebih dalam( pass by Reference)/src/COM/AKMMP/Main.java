package COM.AKMMP;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];

        System.out.println(array1);
        System.out.println(array2);

        array2 = array1;

        System.out.println(array1);
        System.out.println(array2);

        System.out.println("Array 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));

        array2[1] = 100;
        System.out.println("Array 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));

        array1[0] = 50;
        System.out.println("Array 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));

        ubaharray(array1);
        System.out.println("Array 1 -> " + Arrays.toString(array1));
        System.out.println("Array 2 -> " + Arrays.toString(array2));
    }
    //method yang argumentnya adalah reference, pass by reference

    private static void ubaharray(int[] dataarray){
        dataarray[0] = 125;
    }




}









