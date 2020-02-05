import java.util.Scanner;

public class HitungLuas{

	public static void main(String[] args){
		new HitungLuas();

	}

	// fungsi HitungLuas
	public HitungLuas(){
		clearscreen();

		Scanner = new Scanner(System.in);

		// menu
		System.out.println("--- PROGRAM HITUNG LUAS ---");
		System.out.println("1.Persegi");
		System.out.println("2.Persegi Panjang");
		System.out.println("3.Segitiga");
		System.out.println("4.Lingkaran");
		System.out.println("0.tutup");

		System.out.println("\nPilih Menu : ");
		int menu = Scanner.nextlnt();

		// cek menu
		if( menu ==1 )
			persegi();
		
		else if(menu == 0)
			System.exit(0);
		else{
			System.out.println("Menu Tidak Ditemukan");
			display_menu();
		}		
	}

	public void display_menu(){
		try{
			System.in.read();
		}catch(Exception e){}

		new HitungLuas();
	}

	public void clearscreen(){
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}

	public void persegi(){
		clearscreen();

		System.out.println("--- LUAS PERSEGI ---");

		System.out.println("Masukan panjang sisi: ");
		int sisi = Scanner.nextlnt();

		int luas = sisi * sisi;

		System.out.println("Luasnya adalah" + luas);

		display_menu();
	}





}