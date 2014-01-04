//Perintah Inheritance praktikum 6

package Latihan02.Praktikum06.bin;
class Main
{
public static void main(String[] Xx)
{
Santapan s = new Santapan();
Makanan ma = new Makanan();
Minuman mi = new Minuman();
Cemilan ce = new Cemilan();

s.cerna(ma);
s.cerna(mi);
s.cerna(ce);
}
}