package com.akmmp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};

        Scanner scan = new Scanner(System.in);
        System.out.print("nilai array ke:");
        int ndex = scan.nextInt();


        // exception handling (try,catch,finally)

        FileInputStream fileinputstream = null;

        try{
            System.out.printf("index ke-%d, adalah %d\n",ndex,array[ndex]);
        } catch (Exception e){
            System.err.println(e);
        }

        // runtime error jika file tidakada



        try {
            fileinputstream = new FileInputStream("iput.txt");
        } catch (IOException e){
            System.err.println(e);
        }

        // menggabungkan dua exception
        try{
            System.out.printf("index ke-%d, adalah %d\n",ndex,array[ndex]);
            fileinputstream = new FileInputStream("input.txt");
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukan tidak sesuai dengan jumlah array");
        } catch(IOException e){
            System.err.println("file tidak ditemukan");
        }

        //Finally

        try{
            System.out.printf("index ke-%d, adalah %d\n",ndex,array[ndex]);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("\nakhir dari program");


    }
}
