package oopj24csb48;
import java.util.*;
import java.util.Scanner;
class Employee2{
	double basicsalary;
	double DA;
	double HRA;
	Employee2(){
		
	}
	void display() {
		System.out.println("...EMPLOYEE...");
	}
	void calcSalary() {
		basicsalary=basicsalary+((DA/100)*basicsalary)+((HRA/100)*basicsalary);
		System.out.println("the gross salary of the employee is: "+basicsalary);
	}
}

class Engineer extends Employee2{
	Engineer(){
		super();
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("...ENGINEER...");
	}
	void calcSalary() {
		System.out.println("the gross salary of the engineer is: "+(basicsalary*2));
	}
}
public class EngineerInheritance {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Engineer e=new Engineer();
		System.out.println("enter the basic salary of employee: ");
		e.basicsalary=sc.nextDouble();
		System.out.println("enter the DA% of employee: ");
		e.DA=sc.nextDouble();
		System.out.println("enter the HRA% of employee: ");
		e.HRA=sc.nextDouble();
		e.display();
		e.calcSalary();
	}
}