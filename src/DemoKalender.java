//Perintah control flow/struktur kontrol
//perintah pertama - contoh 04

package Latihan01.sesi1.bin;

public class DemoKalender
{
   public static void main (String[] Xx)
     {
	    hitungHari(2010,2);
		hitungHari(2013,4);
	 }
   public static void hitungHari(Integer tahun, Integer bulan)
   {
      switch(bulan)
	  {
	     case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10:
		 case 12:
		    System.out.println("31 Hari");
			break;
		 case 4:
		 case 6:
		 case 9:
		 case 11:
		    System.out.println("30 Hari");
			break;
		case 2:
		   if(tahun % 4 ==0)
		   {
		      System.out.println("29 Hari");
		   }
		   else
		   {
		      System.out.println("28 Hari");
		   }
		   break;
		  default:
		     System.out.println("Nilai Bulan Tidak Valid");
	}
}
}