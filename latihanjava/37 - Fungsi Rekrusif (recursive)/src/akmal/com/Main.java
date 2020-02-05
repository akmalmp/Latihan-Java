package akmal.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan nilai = ");
        int nilai = scan.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);



        PrintNilai(nilai);
        int jumlah = jmlNilai(nilai);
        System.out.println("jumlah = " + jumlah);


        int faktorial = faktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);


    }
    // fungsi rekursif sederhana

    private static int faktorial(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 1){
            return parameter;
        }

        return parameter * faktorial(parameter - 1);
    }

    private static int jmlNilai(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 0){
            return parameter;
        }

        return parameter + jmlNilai(parameter - 1);
    }

    public static void PrintNilai(int parameter){
        System.out.println("nilai = " + parameter);

        if(parameter == 0){
            return;
        }

        parameter--;
        PrintNilai(parameter);



    }

}


