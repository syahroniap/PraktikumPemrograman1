package Latihan02.Praktikum08.bin;

abstract class Shape{
	public String color;
	public Shape(){
	}
	public void setColor (String c){
		color = c;
	}
	public String getColor(){
		return color;
	}
	
	abstract public double area();
}
