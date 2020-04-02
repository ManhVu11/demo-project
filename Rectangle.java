package rectangle;

import java.util.Scanner;

public class Rectangle 
{
	//khai bao thuoc tinh
	private double length,width; 
	
	public Rectangle() {
		
	}
	
	
	public Rectangle(double l,double w) {
		setLength(l);
		setWidth(w);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setLength(double l) {
		if(l<0) length = 0;
		else
			length = l;
	}
	
	public void setWidth(double w) {
		if(w<0) width = 0;
		else 
			width = w;
	}
	
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter length:");
		setLength(kb.nextDouble());
		
		System.out.println("Enter width:");
		setWidth(kb.nextDouble());
	}
	//cai dat cac phuong thuc
	public double area()
	{
		return length*width;
	}
	public double perimeter()
	{
		return (length+width)*2;
	}
	public void output() {
		System.out.println("length: "+this.length);
		System.out.println("width: "+this.width);
		System.out.println("area: "+area());
		System.out.println("perimeter: "+perimeter());
	}
	public static void main(String[] args)
	{
		//cac doi thuong rieng biet
		Rectangle r1 = new Rectangle();
		r1.input();
		r1.output();
		
	}

}
