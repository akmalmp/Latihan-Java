package com.akmmp;

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga semarang");
        printData(builder);

        //insert
        builder.insert(19," kota");
        printData(builder);

        //delete
        builder.delete(19,24);
        printData(builder);

        // rubah karkter pada index tertentu
        builder.setCharAt(14, 'W');
        printData(builder);

        //replace
        builder.replace(20,28,"surabaya");
        printData(builder);

        //casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder databuilder){
        System.out.println("data = " + databuilder);
        System.out.println("panjang = " + databuilder.length());
        System.out.println("kapasitas = " + databuilder.capacity());

        int addressBuilder = System.identityHashCode(databuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

}
