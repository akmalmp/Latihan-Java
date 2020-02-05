package com.akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arraydata = {0,1,2,3};

        Scanner scan = new Scanner(System.in);
        System.out.print("data ke-:");
        int indexinput = scan.nextInt();

        // Excepton biasa
        System.out.println("Exception biasa");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexinput, arraydata[indexinput]);
        }catch (Exception e){
            System.err.println(e);
        }

        // Exception didalam funsi
        System.out.println("Exception dalam fungsi");
        int data = ambildatadariarray(arraydata, indexinput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexinput, data);

        //Exception trows by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try {
            data2 = ambildata(arraydata, indexinput);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexinput, data2);

        System.out.println("\n\nakhir dari program");
    }

    private static int ambildata(int[] array, int index) throws  Exception{
        int hasil = array[index];
        return hasil;
    }

    private static int ambildatadariarray(int[] array, int index){
        int hasil = 0;

        try {
            hasil = array[index];
        }catch (Exception e){
            System.err.println(e);
        }

        return hasil;
    }
}
