package com.latihan;

public class Main {
    public static void main(String[] args){
//        oprator komparasi akan menghasilkan boolean

        int a,b;
        boolean hasilkomparasi;

//        operasi equal atau persamaan
        System.out.println("===OPERASI EQUAL / PERSAMAAN===");
        a = 10;
        b = 10;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilkomparasi);

        a = 20;
        b = 10;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilkomparasi);

//        operasi not equal atau pertidak samaan
        System.out.println("===OPERASI NOT EQUAL / PERTIDAKSAMAAN===");
        a = 10;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilkomparasi);

        a = 11;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilkomparasi);

        //        operasi less than atau kurang dari
        System.out.println("<=== less than / kurang dari ");
        a = 9;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilkomparasi);

        a = 11;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilkomparasi);

        //        operasi greater than atau lebih dari
        System.out.println("<=== greater than / lebih dari ");
        a = 9;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilkomparasi);

        a = 11;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilkomparasi);

    }
}
