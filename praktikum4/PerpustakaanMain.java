//Latihan menggunakan Input *.txt

package Latihan02.Praktikum04.bin;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerpustakaanMain
{
public static void main(String[] Xx)
{
File file = new File("D:/Pemprograman 1/GIT/sesi01/praktikum4/pustaka1.txt");
FileInputStream fis = null;
BufferedInputStream bis = null;
DataInputStream dis = null;
List<Perpustakaan> listPerpustakaan = new ArrayList<Perpustakaan>();
try
{
fis = new FileInputStream(file);
bis = new BufferedInputStream(fis);
dis = new DataInputStream(bis);

while(dis.available() != 0 )
{
//memecah text perbaris menjadi beberapa kolom
//sesuai dengan pemisah koma
String line = dis.readLine();
String[] data = line.split(",");
Perpustakaan p = new Perpustakaan();
p.setId(data[0]);
p.setnamaPeminjam(data[1]);
p.setjudulBuku(data[2]);

listPerpustakaan.add(p);
}
}
catch(IOException ex)
{
System.out.println("File " +file.getName() + " tidak ditemukan !!!");
System.out.println("Exception " +ex.getMessage());
}

for(Perpustakaan perpus : listPerpustakaan)
{
System.out.println("----------------------------------------------------");
System.out.println("ID                     : " +perpus.getId());
System.out.println("Nama Penyewa           : " +perpus.getnamaPeminjam());
System.out.println("Judul Buku             : " +perpus.getjudulBuku());
}
}
}

