package com.Akmmp;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    // tamilkan data
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU ");
                    System.out.println("=========");
                    // cari data
                    break;
                case "3":
                    System.out.println("\n===============");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("===============");
                    // tambh data
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    // ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    // hapus data
                    break;
                default:
                    System.err.println("\nInput anda tidak di temukan");

            }

            isLanjutkan = getYesOrNo("Apakah anda ingin lanjutkan");

        }

    }

    private static void tampilkan() throws IOException{


        boolean isTambah = getYesOrNo("Apakah anda ingin menambah data");
    }

    private static boolean getYesOrNo(String messege) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + messege + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("pilihan anda bukan 'y' atau 'n'");
            System.out.print("\n" + messege + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        }catch (Exception ex){
            System.err.println("tidak bisa clearscreen");
        }
    }


}
