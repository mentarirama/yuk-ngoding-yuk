package formPerson;

class Pekerja {
	protected String nama_pekerja, hp, gender, dob,
	work_address, company, company_address, position, npwp;
	
	void setData(String nama_pekerja, String hp, String gender,
			String dob, String work_address, String company, String company_address,
			String position, String npwp) {
	this.nama_pekerja = nama_pekerja;
	this.gender = gender;
	this.dob = dob;
	this.company = company;
	this.company_address = company_address;
	this.work_address = work_address;
	this.position = position;
	this.hp = hp;
	this.npwp = npwp;
		
	}
	
	void getData() {
		System.out.println("____________________________________");
		System.out.println("----- PROFILE PEKERJA -----");
		System.out.println("Nama			=	"+nama_pekerja);
		System.out.println("Handphone		= 	"+hp);
		System.out.println("Gender 			=	"+gender);
		System.out.println("Date of Birth 		=	"+dob);
		System.out.println("Work Address 		=	"+work_address);
		System.out.println("Company			=	"+company);
		System.out.println("Company Address		=	"+company_address);
		System.out.println("Position		= 	"+position);
		System.out.println("NPWP			=	"+npwp);
	}
}
