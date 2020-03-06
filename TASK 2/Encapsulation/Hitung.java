package Encapsulation;

	public class Hitung {
		private int a;
		private int t;
		
		// method set_get variable alas
		public int get_nilaiA() {
			return a;
		}
		public void set_nilaiA(int angka1) {
			a = angka1;
		}
	
		//method set_get variable B
		public int get_nilaiT() {
			return t;
		}
		public void set_nilaiT(int angka2) {
			t = angka2;
		}
		
		// hitung luas segitiga
		public int luas_segitiga() {
			return (get_nilaiA() * get_nilaiT())/2;
		}
	}

