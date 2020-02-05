package com.Akmmp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String user;

        System.out.print("Panggil Nama: ");
        user = scan.next();
        System.out.println(user);

     switch (user){
         case "akmal" :
               System.out.println("saya akmal hadir bos!");
              break;
         case "ucup":
             System.out.println("hao ]] say ucup");
             break;
         case "aziz":
             System.out.println("abdul zizi");
             break;
         default:
             System.out.println(user + " tidak hadir bos !!!");
       }

        System.out.println("selesai program");

    }
}

