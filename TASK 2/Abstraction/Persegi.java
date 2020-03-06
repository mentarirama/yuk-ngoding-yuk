package Abstraction;

	public class Persegi extends BangunDatar {
		private int s;
		
		public Persegi(int sisi) {
			s = sisi;
		}
		
		@Override
		public void Luas() {
			System.out.println("Luas Persegi 		= "+(s * s));
		}
		
		@Override 
		public void Keliling() {
			System.out.println("Keliling Persegi	="+(s + s));
			System.out.println();
		}
	}

	