//Perintah control flow/struktur kontrol
//perintah pertama - contoh 02

package Latihan01.sesi1.bin;

public class DemoLooping
{
   public static void main(String[] Xx)
   {
     String[][] daftarNilai = new String[][]
	 {
	    new String[]{"001","A"},
		new String[]{"002","B"},
		new String[]{"003","A"},
	 };
	 System.out.println("Looping menggunakan For");
	 
	 for(int i=0; i<daftarNilai.length;i++)
	 {
	    System.out.println("NPM     : "+daftarNilai[i][0]);
	    System.out.println("Nilai   : "+daftarNilai[i][1]);
     }
	 System.out.println("Selesai Looping For");
	 System.out.println();
	 System.out.println();
	 System.out.println("Looping Menggunakan While");
	 int ix = 0;
	 
	 
	while(ix <daftarNilai.length)
	{
        System.out.println("NPM     : " +daftarNilai[ix][0]);
        System.out.println("Nilai   : " +daftarNilai[ix][1]);
		ix++;
   }
   System.out.println("Selesai Looping While");
 }
}