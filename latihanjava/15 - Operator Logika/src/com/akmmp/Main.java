package com.akmmp;

public class Main {
    public static void main(String[] args){

//        operator logika --> operator yang bisa kita lakkukan tipe data boolean
//        AND, OR, XOR, negasi

        System.out.println("=-=-=-= OPERASI LOGIKA =-=-=-=");

        boolean a,b,c,d,e,f,g;

//        OR atau (||)
        System.out.println("=== OR (||) ===");
        a = true;
        b = true;
        d = false;
        f = false;
        c = (a||b);
        e = (a||d);
        g = (d||f);
        System.out.println(a + " || " + b + " = " + c);
        System.out.println(a + " || " + d + " = " + e);
        System.out.println(d + " || " + a + " = " + e);
        System.out.println(d + " || " + f + " = " + g);

        //        AND atau (&&)
        System.out.println("=== AND (&&) ===");
        a = true;
        b = true;
        d = false;
        f = false;
        c = (a&&b);
        e = (a&&d);
        g = (d&&f);
        System.out.println(a + " && " + b + " = " + c);
        System.out.println(a + " && " + d + " = " + e);
        System.out.println(d + " && " + a + " = " + e);
        System.out.println(d + " && " + f + " = " + g);

        //        XOR /eksklusif or atau (^)
        System.out.println("=== XOR (^) ===");
        a = true;
        b = true;
        d = false;
        f = false;
        c = (a^b);
        e = (a^d);
        g = (d^f);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println(a + " ^ " + d + " = " + e);
        System.out.println(d + " ^ " + a + " = " + e);
        System.out.println(d + " ^ " + f + " = " + g);

//        NOT / negasi --> fleeping (!)
        System.out.println("=== NEGASI (!) === ");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) " + c);

    }
}
