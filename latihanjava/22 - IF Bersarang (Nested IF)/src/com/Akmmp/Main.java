package com.Akmmp;

public class Main {

    public static void main(String[] args) {


//        if nested / percabangan bersarang

        int a,b;
        a= 58;
        b = 11;

        System.out.println("ini adalah awal dari program");

        if(a == 5){

            if(b == 10){

                System.out.println("ini kondisi dimana a = 5 dan b = 10");

            }else{

                System.out.println("ini kondisi dimana a = 5 dan b bukan 10");

            }
        }else {

            System.out.println("ini dimana a dan b salah");

        }

        System.out.println("ini adalah akhir dri program");

    }

}
