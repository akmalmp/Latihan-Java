package akmmp.com;

public class Main {

    public static void main(String[] args){

        int a = 0;
        while (true){
            a++;
            if(a == 10){
                break; // keyword untuk memaksa keluar program loop
            }else if(a == 5){
                continue; // keyword untuk memaksa memulai aksi dari awal
            }else if (a == 7){
            }

            System.out.println("looping ke-" + a);
            return;

        }

        System.out.println("akhir dari looping");

    }

}
