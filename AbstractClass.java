package oopj24csb48;
import java.util.*;
abstract class Shape{
	int side;
	abstract void numberOfSides();
}
class Rectangle extends Shape{
	Rectangle(int side){
		super();
		this.side=side;
	}
	void numberOfSides() {
		System.out.println("I am a rectangle. I have 4 sides");
		System.out.println("Sum of angles= "+(side-2)*180);
	}
}
class Triangle extends Shape{
	Triangle(int side){
		this.side=side;
	}
	void numberOfSides() {
		System.out.println("I am a triangle. I have 3 sides");
		System.out.println("Sum of angles= "+(side-2)*180); 
	}
}
class Hexagon extends Shape{
	Hexagon(int side){
		this.side=side;
	}
	void numberOfSides() {
		System.out.println("I am a hexagon. I have 6 sides");
		System.out.println("Sum of angles= "+(side-2)*180); 
	}
}
public class AbstractClass {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String c;
	do {
	System.out.println("enter the sides of geometrical shape");
	int side=sc.nextInt();
		if(side==4) {
			Rectangle r= new Rectangle(side);
			r.numberOfSides();
		}
		else if(side==3) {
			Triangle t=new Triangle(side);
			t.numberOfSides();
		}
		else if(side==6) {
			Hexagon h= new Hexagon(side);
			h.numberOfSides();
		}
		else {
			System.out.println("invalid shape!");
		}
		System.out.println("do you want to continue?(yes/no) ");
		sc.nextLine();
		c=sc.nextLine().toLowerCase();
	}while(c.equals("yes"));
}
}
