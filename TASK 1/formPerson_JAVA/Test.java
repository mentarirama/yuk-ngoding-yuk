package formPerson;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Caleg cal = new Caleg();
		
		String nama_pekerja, hp, gender, dob,
		work_address, company, company_address, position, npwp;
		System.out.println("========== PEKERJA ==========");
		
		System.out.println("Name 			=	");
		nama_pekerja = input.nextLine();
		
		System.out.println("Handphone		= 	");
		hp = input.nextLine();
		
		System.out.println("Gender 			=	");
		gender = input.nextLine();
		
		System.out.println("Date of Birth 	=	");
		dob = input.nextLine();
		
		System.out.println("Work Address 	=	");
		work_address = input.nextLine();
		
		System.out.println("Company			=	");
		company = input.nextLine();
		
		System.out.println("Company Address	=	");
		company_address = input.nextLine();
		
		System.out.println("Position		= 	");
		position = input.nextLine();
		
		System.out.println("NPWP			=	");
		npwp = input.nextLine();
		
		System.out.println();
		System.out.println("========== CALEG ==========");
		
		System.out.println("Partai			=	");
		cal.partai = input.nextLine();
		
		System.out.println("No Urut			=	");
		cal.no_urut = input.nextLine();
		
		System.out.println("Daerah Pilihan	=	");
		cal.dapil = input.nextLine();
		
		System.out.println();
		System.out.println("--- Data Keluarga CALEG ---");
		System.out.println("Istri 			=	");
		cal.istri = input.nextLine();
		
		System.out.println("Anak 1			=	");
		cal.anak1 = input.nextLine();
		
		System.out.println("Anak 2 			=	");
		cal.anak2 = input.nextLine();
		
		cal.setData(nama_pekerja, gender, work_address, company, company_address, position, hp, dob, npwp);
		
		cal.getData();
		
		cal.getDataCaleg();
	}

}
