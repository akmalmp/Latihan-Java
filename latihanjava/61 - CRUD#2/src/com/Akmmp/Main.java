package com.Akmmp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    tampilkanData();
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

    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("database tidak ditemukan");
            System.err.println("silahkan tambahkan data terlebih dahulu");
            return;
        }

        String data = bufferInput.readLine();

        StringTokenizer stringTiken = new StringTokenizer(data,",");

        System.out.println("\n| No |\tTahun |\tPenulis       |\tPenerbit   |\tJudul Buku");
        System.out.println("--------------------------------------------------------------");
        stringTiken.nextToken();
        System.out.printf("| %2d ",1);
        System.out.printf("|\t%4s  ",stringTiken.nextToken());
        System.out.printf("|\t%4s ",stringTiken.nextToken());
        System.out.printf("|\t%4s ",stringTiken.nextToken());
        System.out.printf("|\t%4s ",stringTiken.nextToken());
        System.out.print("\n");

        data = bufferInput.readLine();
        stringTiken = new StringTokenizer(data, ",");
        stringTiken.nextToken();
        System.out.printf("| %2d ",1);
        System.out.printf("|\t%4s  ",stringTiken.nextToken());
        System.out.printf("|\t%4s ",stringTiken.nextToken());
        System.out.printf("|\t%4s ",stringTiken.nextToken());
        System.out.printf("|\t%4s ",stringTiken.nextToken());


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