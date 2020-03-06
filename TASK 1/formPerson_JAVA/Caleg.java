package formPerson;

class Caleg extends Pekerja{
	public String partai, dapil, istri, anak1, anak2, no_urut;
	
	void getDataCaleg() {
		System.out.println("____________________________________");
		System.out.println("----- PROFILE CALEG -----");
		System.out.println("Partai			=	"+partai);
		System.out.println("No Urut			=	"+no_urut);
		System.out.println("Daerah Pilihan		=	"+dapil);
		
		System.out.println("--- Data Keluarga CALEG ---");
		System.out.println("Istri 			=	"+istri);
		System.out.println("Anak 1			=	"+anak1);
		System.out.println("Anak 2 			=	"+anak2);
	}
}
