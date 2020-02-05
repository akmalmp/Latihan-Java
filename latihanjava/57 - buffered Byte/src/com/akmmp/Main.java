package com.akmmp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        long waktustart, waktufinish;

        //membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());


        // menghitung waktu pembacaan
        waktustart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktufinish = System.nanoTime();
        System.out.println("waktu = " + (waktufinish - waktustart));
        byteInput.close();

        //membaca memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInut = new BufferedInputStream(byteInput2);

        // menghitung waktu pembacaan
        waktustart = System.nanoTime();
        System.out.println(bufferedInut.readAllBytes());
        waktufinish = System.nanoTime();
        System.out.println("waktu = " + (waktustart - waktufinish));
    }
}










