package Inheritance;

import java.util.Scanner;

public class BangunRuang {

	public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			Balok b = new Balok(); //objek b dari class Balok / instansiasi
			
			System.out.println("========== INPUT ==========");
			System.out.println("Panjang			= "); 
			int panjang = inp.nextInt();
			b.setPanjang(panjang); //nilai method setPanjang
			
			System.out.println("Lebar			= "); 
			int lebar = inp.nextInt();
			b.setLebar(lebar); //nilai method setLebar
			
			System.out.println("Tinggi			= "); 
			int tinggi = inp.nextInt();
			b.setTinggi(tinggi);//nilai method setTinggi
			
			System.out.println();
			System.out.println("========== OUTPUT ==========");
			System.out.println("Volume Balok		= " + b.getVoume()); 
			System.out.println("Luas Permukaan Balok 	= " + b.getLuasPemukaan());
		}
	}

