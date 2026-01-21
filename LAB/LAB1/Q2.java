//Write an program to create a class with overloaded constructors.

//creating Sum class
class Sum{
	//instance variables
	int a;int b;int c;
	//default constructor
	Sum(){
		this.a=0;this.b=0;this.c=0;
	}
	//overload constructor 1
	Sum(int A){
		this.a=A;this.b=0;this.c=0;
	}
	//overload constructor 2
	Sum(int A, int B){
		this.a=A;this.b=B;this.c=0;
	}
	//overload constructor 3
	Sum(int A, int B,int C){
		this.a=A;this.b=B;this.c=C;
	}
	//method to calculate sum
	public int sum(){
		return this.a+this.b+this.c;
	}
}
//main method 
public class Q2{
	public static void main(String args[]){
		//creating objects using overloaded constructors.
		Sum ob=new Sum();Sum ob1=new Sum(2);
		Sum ob2=new Sum(4,6);Sum ob3=new Sum(8,10,12);
		//printing sum using object method
		System.out.println("Sum using default constructor : "+ob.sum());
		System.out.println("Sum using overloaded constructor 1 : "+ob1.sum());
		System.out.println("Sum using overloaded constructor 2 : "+ob2.sum());	
		System.out.println("Sum using overloaded constructor 3 : "+ob3.sum());	
	}
}