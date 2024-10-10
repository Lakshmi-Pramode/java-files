package oopj24csb48;
import java.util.*;
class Area{
	void AreaOfTriangle(double a,double b) {
		double area=0.5*(a*b);
		System.out.println("area of triangle= "+area); }
	void AreaOfRectangle(int l, int w) {
		int area = l*w; 
		System.out.println("area of rectangle= "+area); }
	void AreaOfTrapezium(double p1,double p2,double h) {
		double area = ((p1+p2)/2)*h;
		System.out.println("area of trapezium= "+area); }
	void AreaOfCircle(double r) {
		double area =3.14*(r*r);
		System.out.println("area of circle= "+area); }
}

public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area area= new Area();
		System.out.println("enter the base of triangle:");
		double a=sc.nextDouble();
		System.out.println("enter the height of triangle:");
		double b=sc.nextDouble();
		System.out.println("enter the width of rectangle:");
		int w=sc.nextInt();
		System.out.println("enter the length of rectangle:");
		int l=sc.nextInt();
		System.out.println("enter the parallel sides and height of trapezium:");
		double p1=sc.nextDouble(); double p2=sc.nextDouble(); double h=sc.nextDouble();
		System.out.println("enter the radius of circle:");
		double r=sc.nextDouble();
		area.AreaOfTriangle(a, b);
		area.AreaOfRectangle(l, w);
		area.AreaOfTrapezium(p1, p2, h);
		area.AreaOfCircle(r);
	}

}

