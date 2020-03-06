package Abstraction;

public class Result {

	public static void main(String[] args) {
		/* class utama yang dimana nantinya 
		 * class-class lainnya kan di pangi 
		 * didalam class utama main ini.*/
		
		Persegi p1 = new Persegi(5);
		p1.Luas();
		p1.Keliling();
		
		PersegiPanjang p2 = new PersegiPanjang(20,10);
		p2.Luas();
		p2.Keliling();
		
		Segitiga seg = new Segitiga(2,4,6);
		seg.Luas();
		seg.Keliling();
		}
	}

