package Inheritance;

	public class Balok extends PersegiPanjang{
		public int tinggi;
		
		//method TINGGI
		public void setTinggi(int tinggi){
			this.tinggi = tinggi; 
		}
		public int getTinggi(){
			return tinggi; 
		}
		
		//method VOLUME
		public int getVoume(){
			return getPanjang() * getLebar() * getTinggi(); //ngitung volume
		}
		
		//ngitung LuasPermukaan
		public int getLuasPemukaan(){
			return 2 *(getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi());
		}
	}

	