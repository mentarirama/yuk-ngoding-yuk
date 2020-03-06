package Polymorphism;

import java.util.Scanner;

	public class Hitung {
		//overloading polimorf
		Scanner inp = new Scanner(System.in);
		
		void hitungVolume(int panjang, int lebar, int tinggi) {
			System.out.println("Masukan panjang		= ");
			panjang = inp.nextInt();
			
			System.out.println("Masukan lebar 		= ");
			lebar = inp.nextInt();
			
			System.out.println("Masukan tinggi		= ");
			tinggi = inp.nextInt();
			
			int volume = volume = panjang * lebar * tinggi; 
			System.out.println("Volume Balok 		= "+volume);
			
		}
		
//		void hitungVolume(String panjang, String lebar, String tinggi) {
//			String hasil = panjang + lebar + tinggi; 
//			System.out.println("Hasil tambah String	= "+hasil);
//			
//		}
		
	}
