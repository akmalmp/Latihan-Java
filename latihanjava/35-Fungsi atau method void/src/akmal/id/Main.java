package akmal.id;

public class Main {
    public static void main (String[] args){

        System.out.println(Simple());

       FungsiVoid("Apa pun");

       SelamatPagi("dobleh");
       SelamatPagi("jamal");
       SelamatPagi("Kabur");


    }

    private static void SelamatPagi(String nama){

        System.out.println("selamat pagi " + nama);

    }

    private static void FungsiVoid(String input){

        System.out.println(input);

    }

    private static float Simple(){

        return 10.0f;

    }

}
