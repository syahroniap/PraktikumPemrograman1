//latihan variabel
package Latihan01.sesi1.bin;

public class DemoVariabel1{
     public static void main(String[] qq){
	    int x=10;
		System.out.println("Nilai X adalah " +x);
		
		char z='a';
		System.out.println("Nilai Z adalah " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("Nilai Y adalah " +y);
		
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println("Nilai W adalah " +x);
		
		//type casting
		int v =10;
		System.out.println("Nilai V adalah " +v);
		System.out.println(" ");
		System.out.println("Baris Selanjutnya");
		
		
		roni();
		
		System.out.println("Setelah Menjalankan roni");
	}
	static char v;
	
	public static void roni(){
	   int v=2;
	   System.out.println("Nilai V Adalah " +v);
	   // variabel v tidak boleh dihapus karena masih dipakai dan masih berada dalam scope
	   short d=15; //variabel d boleh dihapus di baris 26, karena lifetimenya sudah habis
	   System.out.println("D adalah "+d); // variabel d boleh dihapus di baris 26
	}
}