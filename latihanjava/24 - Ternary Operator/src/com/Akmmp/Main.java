package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

//        ternary operator


        int x, input;

        Scanner scan = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = scan.nextInt();
        System.out.println(input);

//        variable x = ekspresi ? statements_true : statements_false

        x = (input == 10) ? (input * input) : (input / 2);

        System.out.println("hasilnya " + x);

    }

}
