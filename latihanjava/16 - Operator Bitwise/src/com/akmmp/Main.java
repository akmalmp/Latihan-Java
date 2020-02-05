package com.akmmp;

import static java.lang.Integer.toBinaryString;

public class Main {
    public static void main(String[] args) {

//        Opterator Bitwise --> operator untuk  melakukn operasi pada nilai bit
        byte a = 3;
        byte b,c;
        String a_bits, b_bits, c_bits;



//        operator SHIFT LEFT
        System.out.println("=== SHIFT LEFT (<< ===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        //        operator SHIFT RIGHT
        a = 24;
        System.out.println("=== SHIFT RIGHT (>>) ===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        //        operator bitwise OR
        a = 24;
        System.out.println("=== BITWISE OR ( | ) ===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-----------------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

        //        operator bitwise AND
        a = 24;
        System.out.println("=== BITWISE AND (&) ===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("-----------------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);

    }
}
