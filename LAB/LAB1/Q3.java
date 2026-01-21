//write a program to create a class Box and add its five object in the ArrayList 
//and traverse through the ArrayList using Iterator

//import
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

//creating box class
class Box{
	//instance variables
	int l;
	int b;
	//constructor
	Box(int length, int breadth){
		this.l=length;
		this.b=breadth;
	}
	//method to calculate area
	public int area(){
		return this.l*this.b;
	}
}

//main class
public class Q3{
	public static void main(String[] args){
		//creating Scanner
		Scanner sc=new Scanner(System.in);
		//creating ArrayList for Box object
		ArrayList<Box> a1= new ArrayList<Box>();
		for(int i=1;i<=5;i++){
			System.out.print("Enter length of Box "+i+" : ");
			int l=sc.nextInt();
			System.out.print("Enter breadth of Box "+i+" : ");
			int b=sc.nextInt();
			//creating Box object 
			Box bo=new Box(l,b);
			//adding Box object to ArrayList
			a1.add(bo);
		}
		//traverse through the ArrayList using iterator
		Iterator<Box> itr = a1.iterator();int i=1;
		while(itr.hasNext()){
			Box bo=itr.next();
			System.out.print("Area of Box "+i+" : "+bo.area()+"\n\n");
			i++;
		}
	}
}
		