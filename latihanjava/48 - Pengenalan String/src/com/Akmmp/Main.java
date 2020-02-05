package com.Akmmp;

import java.util.*;

public class Main {

    public static void main (String[] args){

        //membuat array
        String kataString = "halo - halo Bandung";

        char[] kataChar = {'h','a','l','l','o'};

        //menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen String
        System.out.println("komponen pertama dari char[] = " + kataChar[3]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(3));

        //merubah komponen dari String
        //itu tidak bisa...kenapa?, karena String di java itu immutable
        kataChar[0] = 'c';

        System.out.println(Arrays.toString(kataChar));

        //kita bisa merubah komponen secara tidak langsung

        System.out.println(kataString);

        printAddress("kataString",kataString);

        kataString = "c" + kataString.substring(1,5);

        System.out.println(kataString);

        printAddress("kataString",kataString);

    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + "=" + data + "\t|| address = " + Integer.toHexString(address));
    }
}
