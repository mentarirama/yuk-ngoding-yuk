package Abstraction;

	public class Segitiga extends BangunDatar{
		private int x;
		private int a;
		private int t;
		
		public Segitiga(int sisi, int alas, int tinggi) {
			x = sisi;
			a = alas;
			t = tinggi;
		}
		
		@Override
		public void Luas() {
			// mencetak hasil hitung luas segitiga 
			System.out.println("Luas Segitiga 		= "+((a * t)/2));
		}
		@Override
		public void Keliling() {
			// mencetak hasil hitung keliling segitiga
			System.out.println("Keliling Segitiga 	= "+(x + x + x));
			System.out.println();
		}
	}

	