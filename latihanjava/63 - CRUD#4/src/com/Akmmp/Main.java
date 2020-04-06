package com.Akmmp;

import java.io.*;
import java.time.Year;
import java.util.Arrays;
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
            System.out.println("0.\tKeluar");

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
                    cariData();
                    break;
                case "3":
                    System.out.println("\n===============");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("===============");
                    // tambh data
                    tambahData();
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
                case "0":
                    exit();
                    break;
                default:
                    System.err.println("\nInput anda tidak di temukan");

            }

            isLanjutkan = getYesOrNo("Apakah anda ingin lanjutkan");

        }

    }

    private static void tambahData() throws IOException{


        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);


        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("masukan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("masukan tahun terbit: ");
        tahun = ambilTAhun();

        // cek buku di database

        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDiDatabase(keywords,false);

        // menulis buku di databse
        if (!isExist){
//            fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(ambilEntryPerTahun(penulis, tahun));
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

            String punulisTanpaSpasi = penulis.replaceAll("\\s+","");
            String primaryKey = punulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("primary key  : " + primaryKey);
            System.out.println("tahun terbit : " + tahun);
            System.out.println("penulis      : " + penulis);
            System.out.println("judul        : " + judul);
            System.out.println("penerbit     : " + penerbit);

            boolean isTambah = getYesOrNo("Apakah akan ingin menambah data tersebut? ");

            if(isTambah){
                bufferOutput.write(primaryKey + "," + tahun + ","+ penulis +"," + penerbit + ","+judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }

        } else {
            System.out.println("buku yang anda akan masukan sudah tersedia");
            cekBukuDiDatabase(keywords,true);
        }


        bufferOutput.close();
    }

    private static long ambilEntryPerTahun(String penulis, String tahun) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while(data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+","");

            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next()) ) {
                entry = dataScanner.nextInt();
            }

            data = bufferInput.readLine();
        }

        return entry;
    }


    private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay) throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();

        boolean isExist = false;
        int nomordata = 0;

        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis              |\tPenerbit             |\tJudul Buku");
            System.out.println("-----------------------------------------------------------------------------");
        }

        while (data != null){

            // cek keywords di dalam baris
            isExist = true;

            for (String keyword:
                    keywords) {
                isExist = data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordnya cocok maka tampilkan

            if (isExist) {
                if (isDisplay) {
                    nomordata++;
                    StringTokenizer stringTiken = new StringTokenizer(data, ",");

                    stringTiken.nextToken();
                    System.out.printf("| %2d ", nomordata);
                    System.out.printf("|\t%4s  ", stringTiken.nextToken());
                    System.out.printf("|\t%-20s ", stringTiken.nextToken());
                    System.out.printf("|\t%-20s ", stringTiken.nextToken());
                    System.out.printf("|\t%s ", stringTiken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }

            data = bufferInput.readLine();
        }
        if (isDisplay) {
            System.out.println("-----------------------------------------------------------------------------");
        }



        return isExist;
    }

    private static String ambilTAhun(){
        boolean tahunvalid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput= terminalInput.nextLine();


        while (!tahunvalid) {
            try {
                Year.parse(tahunInput);
                tahunvalid = true;
            } catch (Exception e) {
                System.err.println("tahun tidak tepat");
                System.out.print("masukan tahun: ");
                tahunvalid = false;
                tahunInput = terminalInput.nextLine();
            }
        }

        return tahunInput;
    }

    private static void cariData() throws IOException {

        // mambaca database ada atau tidak

        try {
            File file = new File("database.txt");
        }catch (Exception e){
            System.err.println("database tidak ditemukan");
            System.err.println("silahkan tambahkan data terlebih dahulu");
            return;
        }

        // kita ambil keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // cek keyword di database

        cekBukuDiDatabase(keywords,true);

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

        System.out.println("\n| No |\tTahun |\tPenulis              |\tPenerbit             |\tJudul Buku");
        System.out.println("-----------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int noData = 0;
        while (data != null) {
            noData++;
            StringTokenizer stringTiken = new StringTokenizer(data, ",");

            stringTiken.nextToken();
            System.out.printf("| %2d ", noData);
            System.out.printf("|\t%4s  ", stringTiken.nextToken());
            System.out.printf("|\t%-20s ", stringTiken.nextToken());
            System.out.printf("|\t%-20s ", stringTiken.nextToken());
            System.out.printf("|\t%s ", stringTiken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("akhir dari databse");


    }

    private static boolean getYesOrNo(String messege)  {
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

    private static void exit() {
        clearScreen();
        System.out.println("BYE");
        try{
            System.in.read();
        }catch (Exception e){}
        clearScreen();
        System.exit(0);

    }


}
