package akmmp.gmail.com;

import java.util.Scanner;

public class Main {
    public static void main (String[] args ) {

        int panjang, lebar;

        Scanner scan = new Scanner(System.in);
        System.out.print("panjang = ");
        int inputpanjang = scan.nextInt();
        System.out.print("lebar = ");
        int inputlebar = scan.nextInt();

        gambar(inputpanjang, inputlebar);

        tampil(inputpanjang, inputlebar);

    }


    private static void tampil(int panjang, int lebar){
        System.out.println("luas = " + Luas(panjang, lebar));
        System.out.println("keliling = " + Luas(panjang, lebar));

    }

    private static int Keliling(int panjang, int lebar){
        int hasil = 2 * (panjang + lebar);
        return hasil;

    }

    private static int Luas(int panjang, int lebar){
        int hasil;
        hasil = panjang * lebar;
        return hasil;

    }

    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");

        }

    }

}
