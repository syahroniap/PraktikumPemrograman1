//Perintah Inheritance
//kelas turunannya

package Latihan01.sesi1.bin;
class Harimau extends KucingBesar
{
	//Konstruktor untuk class Singa
	public Harimau(String namaHarimau)
	{
	//mengisi pengubah yang diwarisi oleh kelas abstract
	Harimau.nama = namaHarimau;
	}
	//implementasi methode yang diwarisi dari kelas abstrct
	public void Makan()
	{
	System.out.println("Harimau Makan Daging dan minum susu");
	System.out.println();
	}
}