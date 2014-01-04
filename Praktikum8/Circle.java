//Praktikum 8 Soal 1
package Latihan02.Praktikum08.bin;

public class Circle extends GraphicObject{
	void resize() {
	System.out.println("Circle Resize");
	}
	void drawShape(){
	System.out.println("Circle Shape");
	}
	void posisition(){
	System.out.println(this.x + this.y);
	}
}