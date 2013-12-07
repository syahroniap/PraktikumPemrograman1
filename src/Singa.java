//Perintah Inheritance
//kelas turunannya

package Latihan01.sesi1.bin;
class Singa extends KucingBesar
{
	//Konstruktor untuk class Singa
	public Singa(String namaSinga)
	{
	//mengisi pengubah yang diwarisi oleh kelas abstract
	Singa.nama = namaSinga;
	}
	//implementasi methode yang diwarisi dari kelas abstrct
	public void Makan()
	{
	System.out.println("Singa Makan Daging");
	System.out.println();
	}
}