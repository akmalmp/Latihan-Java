package com.akmmp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {

    public static void main(String[] args) throws IOException {

            FileInputStream inputFILE = new FileInputStream("input.txt");

        System.out.println((char)inputFILE.read());

        System.out.println("akhir dari program");
    }
}
