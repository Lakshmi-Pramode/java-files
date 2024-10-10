package oopj24csb48;
import java.util.*;
class Employee
{
	String name;
	String address;
	int age;
	long phone;
	double salary;
	void printName() {
		System.out.println("Name: "+name);
		}
	void printAddress() {
		System.out.println("Address: "+address);
		}
	void printAge() {
		System.out.println("Age: "+age);
		}
	void printPhone() {
		System.out.println("Phone no: "+phone);
		}
	void printSalary() {
		System.out.println("Salary: "+salary);
	}
}
class Officer extends Employee
{
	String spcl;
	void printSpecialization() {
		System.out.println("Specialization: "+spcl);
	}
}
	class Manager extends Employee{	
	String dept;
	void printDepartment() {
		System.out.println("Department: "+dept);
	}
}
public class EmployeeInheritance {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
		Officer o= new Officer();
		System.out.println("enter name of officer: ");
		o.name= sc.nextLine();
		System.out.println("enter the address of officer: ");
		o.address= sc.nextLine();
		System.out.println("enter the age of officer: ");
		o.age= sc.nextInt();
		System.out.println("enter phone No of officer: ");
		o.phone= sc.nextLong();
		System.out.println("enter salary of officer: ");
		o.salary= sc.nextDouble();
		sc.nextLine();
		System.out.println("enter specialization: ");
		o.spcl= sc.nextLine();
		
		Manager m= new Manager();
		System.out.println("\nenter name of manager: ");
		m.name= sc.nextLine();
		System.out.println("enter the address of manager: ");
		m.address= sc.nextLine();
		System.out.println("enter the age of manager: ");
		m.age= sc.nextInt();
		System.out.println("enter phone No of manager: ");
		m.phone= sc.nextLong();
		System.out.println("enter salary of manager: ");
		m.salary= sc.nextDouble();
		sc.nextLine();
		System.out.println("enter department: ");
		m.dept= sc.nextLine();
		System.out.println("\nOFFICER DETAILS\n");
		o.printName();
		o.printAddress();
		o.printAge();
		o.printPhone();
		o.printSalary();
		o.printSpecialization();
		System.out.println("\nMANAGER DETAILS\n");
		m.printName();
		m.printAddress();
		m.printAge();
		m.printPhone();
		m.printSalary();
		m.printDepartment();
	}
}

