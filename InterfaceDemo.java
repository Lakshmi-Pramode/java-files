package oopj24csb48;
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	void walk() {
		System.out.println("this animal walks by "+legs+" legs");
		}
	abstract void eat();
}
class Spider extends Animal{
	Spider(int legs){
		super(legs);
	}
	void eat() {
		System.out.println("spider eats insects ");
	}
}
interface Pet {
	abstract void getname();
	abstract void setname(String name);
	abstract void play();
}
class Cat extends Animal implements Pet{
	String name;
	Cat(String name,int legs){
		super(legs);
		this.name=name;
	}
	void eat() {
		System.out.println("cat eat fishes ");
	}
	public void play() {
		System.out.println("cat play with rats ");
	}
	public void getname() {
		System.out.println("this cat's name is "+name);
	}
	public void setname(String name) {
		System.out.println("this cat's name is "+name);
	}
}
class Fish extends Animal implements Pet{
	String name;
	Fish(String name,int legs){
		super(legs);
		this.name=name;
	}
	void eat() {
		System.out.println("fish eat plants ");
	}
	public void getname() {
		System.out.println("this fish's name is "+name);
	}
	public void setname(String name) {
		System.out.println("this fish's name is "+name);
	}
	public void walk() {
		System.out.println("fish has no legs");
	}
	public void play() {
		
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		System.out.println("FISH");
		Fish f=new Fish("mimi",0);
		f.getname();
		f.eat();
		f.walk();
		f.setname("momo");
		System.out.println("SPIDER");
		Spider s=new Spider(8);
		s.eat();
		s.walk();
		System.out.println("CAT");
		Cat c=new Cat("fluffy",4);
		c.getname();
		c.walk();
		c.play();
		c.eat();
		c.setname("moose");
	}
}
