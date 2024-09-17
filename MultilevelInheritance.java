package tut7;
import java.util.*;
class Vechicle{
    String model;
    int year;
}
class Car extends Vechicle{
    int door;
}
class ElectricCar extends Car{
    String battery;
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Year :"+year);
        System.out.println("No of doors :"+door);
        System.out.println("Battery Capacity:"+battery);
    }
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        ElectricCar e=new ElectricCar();
        System.out.println("Enter the model of car: ");
        e.model=sc.next();
        System.out.println("Enter year: ");
        e.year=sc.nextInt();
        System.out.println("Enter the no of doors: ");
        e.door=sc.nextInt();
        System.out.println("Enter the batteyr capacity: ");
        e.battery=sc.next();
        System.out.println("\nCAR DETAILS:");
        e.display();
	}
}
