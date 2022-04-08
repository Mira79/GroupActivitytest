import java.util.Scanner;

/* class GrandParent {//Multilevel inheritance
	
public String str1="I am grand parent class";
public void display() {
	System.out.println(str1);
	}
}
 class Parent extends GrandParent{
		public String str2="I am parent class";
		public void display() {
			System.out.println(str2);
			} 
	}
class Child extends Parent{
	public String str3="I am a child class";
	public void display() {
		System.out.println(str3);
		} 
}*/
/*class Vehicle{//Hierarchical inheritance
	String madeIn="USA";
	public void display() {
		System.out.println("Made in :"+madeIn);
	}
}
class Car extends Vehicle{
	String make="Ford";
	public void displayCarDetails() {
		System.out.println(make+"Made in :"+madeIn);
	}
}
class Aircraft extends Vehicle{
	String type="Boeing";
	public void displayAircraftDetails() {
		System.out.println(type+"Made in :"+madeIn);
	}
}*/
/*interface functionalityOne{//using interface
	void op1();
}
interface functionalityTwo{
	void op2();
}
class InterfaceExample implements functionalityOne,functionalityTwo{
	public void op1() {
		System.out.println("This is op1");
	}
	public void op2() {
		System.out.println("This is op2");
	}
}*/
/*abstract class Animal{//using abstract method
	public abstract void sound();
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Bark");
	}
}
class Crow extends Animal{
	public void sound() {
		System.out.println("Caw Caw");
	}
}*/

interface A {
public static final int a = 0;
void methodOne();
	
}
 class B implements A {
int a = 20;
public void methodOne(){
System.out.println("hello world");
}
}
public class Main {

	public static void main(String[] args) {
	
		B eg=new B();
		eg.methodOne();
		
		/*Animal obj1=new Dog();
		obj1.sound();
		Animal obj2=new Crow();
		obj2.sound();*/
		///////////////output should be btc x=0,y=2//////////////
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x and y value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		String buy="bitcoin";
		System.out.println(buy.substring(x, x+1) + buy.substring(y,y+2));
		
	}

}
