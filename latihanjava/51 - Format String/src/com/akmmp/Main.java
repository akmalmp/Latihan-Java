package com.akmmp;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String nama = "udin";
        int umur = 17;

        //output: Nama sya adalah Udin, umur saya adalah 17
        System.out.println("Nama saya adalah " + nama + ", umur saya adalah " + umur);

        // cara lainya adalah dengan format String
        System.out.printf("Nama saya adalah %s, umur %s saya adalah %d\n",nama, nama, umur);

        // conversion : f=floating point, d=Integer, c=character, s=string, b=boolean

        // struktur format = %[argumen_index$][flags][width][.precision]conversion

//        [argumen_index$]
        System.out.println("\n[argumen_index$]");

        //udin, wahai udin, kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?",nama);
        // umur udin berapa?, udin menjawab: 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa?, %1$s menjawab: %2$d, \nwah masih muda ya umurnya %2$d\n",nama,umur);

        // [flags]
        System.out.printf("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("\n%d - %d = %+d\n",int1,int2,hasil);

        // [width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("UNTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); // flags "-", artinya rata kiri
        System.out.printf("%+5d\n",int3); // flags akan mengambil slot dalam format
        System.out.printf("%+-6d\n",int3); // flags bisa digabungkan
        System.out.printf("%10d\n",int3);
        System.out.printf("% 10d\n",int3);
        System.out.printf("%010d\n",int3);
        System.out.printf("%+010d\n",int3);
        int int4 = 1000000000;
        System.out.printf("%-,15d\n",int4);

        System.out.println("\n[floating point]");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1); // floating point akanmengambil width dengan desimal

        // [.precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2);
        System.out.printf("%+08.2f\n", float2);

        // contoh

        String nama2 = "ucup;";
        float ipk = 3.78556457f;

        System.out.printf("\nipk %1$s berapa?,\n%1$s: saya dapet %2$5.2f",nama,ipk);

        //kesimpulan

        // save format ini kedalam variable string
        String info = "nama: " +nama2 + ", ipk = " + ipk;
        System.out.println(info);

        String info_format = String.format("nama: %s, ipk = %2$+5.2f",nama2,ipk);
        System.out.println(info_format);

        // save format ini dalam string buider

        StringBuilder builder_info = new StringBuilder();
        Formatter foermaterBuilder = new Formatter(builder_info);

        foermaterBuilder.format("nama: %s, ipk = %2$+5.2f",nama2,ipk);
        System.out.println(builder_info);





    }
}











