package Abstraction;

	public class PersegiPanjang extends BangunDatar {
		private int p;
		private int l; 
		
		public PersegiPanjang(int panjang, int lebar) {
			p = panjang;
			l = lebar;
		}
		
		@Override
		public void Luas() {
			//mencetak hasil hitung luas persegi panjang
			System.out.println("Luas Persegi Panjang		= "+(p * l));
		}
		@Override
		public void Keliling() {
			// mencetak hasil hitung keliling persegi panjang
			System.out.println("Keliling Persegi Panjang	= "+(2*(p + l)));
			System.out.println();
		}
	}

	