package tut7;
import java.util.*;
class Employeee{
    String name;
    String ID;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
    }
}
class fullTime extends Employeee{
    float annualSalary;
    void annual(){
         System.out.println("Annual Salary: "+annualSalary);
    }
}
class partTime extends Employeee{
    float hourlyRate;
    void hourly(){
        System.out.println("Hourly Rate: "+hourlyRate);
    }
}
public class HeirarchicalInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        partTime p=new partTime();
        fullTime f=new fullTime();
        System.out.print("Enter the name of full time empolyee:");
        f.name=sc.nextLine();
        System.out.print("Enter the employee id:");
        f.ID=sc.next();
        System.out.print("Enter the annual salary:");
        f.annualSalary=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the name of part time empolyee:");
        p.name=sc.nextLine();
        System.out.print("Enter the employee id:");
        p.ID=sc.next();
        System.out.print("Enter the hourly rate:");
        p.hourlyRate=sc.nextFloat();
        System.out.println("\nFULL TIME EMPLOYEE:");
        f.display();
        f.annual();
        System.out.println("\nPART TIME EMPLOYEE:");
        p.display();
        p.hourly();
	}
}
