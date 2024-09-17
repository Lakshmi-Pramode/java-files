package tut7;
import java.util.*;
class employee{
    String name;
    String id;
    void display(){
    	System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
class manager extends employee{
    String dept; 
    void manage(){
        System.out.print("Department :"+dept);
        
    }
}
public class SingleInheritance {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        employee e=new employee();
	        manager m=new manager();
	        System.out.print("Enter the name of empolyee:");
	        e.name=sc.nextLine();
	        System.out.print("Enter the employee id:");
	        e.id=sc.next();
	        sc.nextLine();
	        System.out.print("Enter the name of manager: ");
	        m.name=sc.nextLine();
	        System.out.print("Enter the manager id:");
	        m.id=sc.next();
	        System.out.print("Enter the department: ");
	        m.dept=sc.next();
	        System.out.println("\nEMPLOYEE DETAILS");
	        e.display();
	        System.out.println("\nMANAGER DETAILS");
	        m.display();
	        m.manage();
	}
}
