package Encapsulation;

import java.util.Scanner;

	public class Hasil_Hitung {

		public static void main(String[] args) {
			// melakukan panggilan thdp class Hitung
		
			Scanner s = new Scanner(System.in);
			Hitung H = new Hitung();
			
			System.out.println("Masukan alas		=");
			int a = s.nextInt();
			H.set_nilaiA(a);
			
			System.out.println("Masukan tinggi		= ");
			int t = s.nextInt();
			H.set_nilaiT(t);
			
			System.out.println("Luas Segitiga		= "+H.luas_segitiga());		
			}
	}

	