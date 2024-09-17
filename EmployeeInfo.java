package tut9;
import java.util.*;
abstract class Employees{
	String name; String type;
	Employees(String name,String type){
		this.name=name;
		this.type=type; }
	abstract void calcMonthSalary();
	void printName(){
		System.out.println("Name:"+name);
	} }
class FullTimeEmployees extends Employees{
	double salary; final double HRA=1000;
	FullTimeEmployees(String name,double salary){
		super(name,"Full Time");
		this.salary=salary;	}
	void calcMonthSalary(){
		System.out.println(name+"'s salary:"+(salary+HRA)); } }
class PartTimeEmployees extends Employees {
	double hourlyWage; int noOfHours;	final int workingDays=25;
	PartTimeEmployees(String name,double hourlyWage,int noOfHours){
		super(name,"Part Time");
		this.noOfHours=noOfHours;
		this.hourlyWage=hourlyWage; }
	void calcMonthSalary(){
		System.out.println(name+"'s salary:"+(hourlyWage*noOfHours*workingDays));
	} }
class Intern extends Employees {
	double stipend;
	Intern(String name,double stipend) {
		super(name,"Intern"); this.stipend=stipend; }
	void calcMonthSalary() {
		System.out.println(name+"'s Stipend:"+stipend); } } 
public class EmployeeInfo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c;
		do {
			System.out.println("Enter Employee's name:");
			String name=sc.nextLine();
			System.out.println("Enter employee's job type(Full time/Part Time/Intern):");
			String type=sc.nextLine().toLowerCase();
			if(type.equals("full time")) {
				System.out.println("Enter the monthly salary:");
				double salary=sc.nextDouble();	sc.nextLine();
				FullTimeEmployees f=new FullTimeEmployees(name,salary); 	f.calcMonthSalary();	}
			else if(type.equals("part time")) {
				System.out.println("Enter hourly wage:");
				double hourlyWage=sc.nextDouble();
				System.out.println("Enter number of hours worked/day:");
				int noOfHours=sc.nextInt(); 	sc.nextLine();
				PartTimeEmployees p=new PartTimeEmployees(name,hourlyWage,noOfHours);
				p.calcMonthSalary(); }
			else if(type.equals("intern")) {
				System.out.println("Enter the stipend amount:");
				double stipend=sc.nextDouble(); 	sc.nextLine();
				Intern i=new Intern(name,stipend);
				i.calcMonthSalary(); }
			else {
				System.out.println("Invalid type!");	}
				System.out.println("Do you want to continue(yes/no):");
				c=sc.nextLine().toLowerCase();	}
		while(c.equals("yes"));	} }
