package com.akmmp;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //membuka file

        //Byte stream -> FileInputStream
        //Charakter Stream -> FileReader

        FileInputStream bytefileInput = new FileInputStream("input.txt");
        FileReader charfileInput = new FileReader("input.txt");

        FileOutputStream bytefileOutput = new FileOutputStream("outputbyte.txt");
        FileWriter charfileOutput = new FileWriter("outputchar.txt");


        // membaca file

        //byte fie
        int buffer = bytefileInput.read();

        while (buffer != -1){
            System.out.print((char)buffer);
            bytefileOutput.write(buffer);
            buffer = bytefileInput.read();
        }

        System.out.println("\n");

        //charfile
        buffer = charfileInput.read();

        while (buffer != -1){
            System.out.print((char)buffer);
            charfileOutput.write(buffer);
            buffer = charfileInput.read();
        }



        // menutup file

        bytefileInput.close();
        charfileInput.close();
        bytefileOutput.close();
        charfileOutput.close();

    }
}
