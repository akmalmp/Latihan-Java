package com.akmmp;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //try {
//            FileInputStream fileinput = new FileInputStream("input.txt");
//        }catch (Exception e) {
//            System.err.println(e);
//        }

            FileInputStream fileinput = new FileInputStream("input.txt");

            System.out.println((char)fileinput.read());
            System.out.println((char)fileinput.read());
            System.out.println((char)fileinput.read());
            System.out.println((char)fileinput.read());

    }
}
