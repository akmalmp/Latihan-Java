package akmmp.com;

public class Main {
    public static void main(String[] args) {

//        y = y + 2 * x

        int x,y;
        x = 10;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);



    }

    private static int hitung(int input){
        int hasil;

        hasil = (input + 2) * input;

        return hasil;

    }

}
