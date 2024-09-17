package tut9;
import java.util.*;
class Student {
	String name;
	int age;
	long ID;
	Student(String name,int age,long ID){
		this.name=name;
		this.age=age;
		this.ID=ID; }
	void display(){
		System.out.println("Student name:"+name);
		System.out.println("Age:"+age);
		System.out.println("ID:"+ID);
	} }
class Hostlers extends Student{
	String hostel;
	Hostlers(String name,int age,long ID,String hostel){
		super(name,age,ID);
		this.hostel=hostel; }
	void display(){
		super.display();
		System.out.println("Hostel name:"+hostel);
	} }
class DayScholars extends Student{
	String bus;
	DayScholars(String name,int age,long ID,String bus){
		super(name,age,ID);
		this.bus=bus; }
	void display(){
		super.display();
		System.out.println("Bus Route:"+bus);
	} }
public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name=sc.nextLine();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the student ID:");
		long ID=sc.nextLong();
		sc.nextLine();
		System.out.println("Are you a hostler or a day scholar?");
		String ch=sc.nextLine().toLowerCase();
		if(ch.equals("hostler")){
			System.out.println("Enter the hostel name:");
			String hostel=sc.nextLine();
			Hostlers h=new Hostlers(name,age,ID,hostel);
			System.out.println("STUDENT DETAILS:");
			h.display(); }
		else if(ch.equals("dayscholar")){
			System.out.println("Enter the bus route:");
			String bus=sc.nextLine();
			DayScholars d=new DayScholars(name,age,ID,bus);
			System.out.println("STUDENT DETAILS:");
			d.display(); }
		else{
			System.out.println("Invalid..!");
		} }
}
