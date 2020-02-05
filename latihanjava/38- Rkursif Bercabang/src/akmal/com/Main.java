package akmal.com;

import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String[] args){

        fibonacci(5, "atas");
    }

    private static int fibonacci(int n, String daun){

        System.out.println("daun " + daun);
        System.out.println("fibonacci ke-" + n);

        if(n == 1 || n == 0){
            return 0;
        }

        return fibonacci(n-1, "kiri") + fibonacci(n -2, "kanan");
    }

}
