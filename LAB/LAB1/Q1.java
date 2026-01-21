//WAP to create an array of box object and calculate the area of each box object.
import java.util.Scanner;
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
//main method 
public class Q1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//creating array of box object
		Box[] box_array = new Box[5];
		for(int i=1;i<=5;i++){
			System.out.print("Enter length of Box "+i+" : ");
			int l=sc.nextInt();
			System.out.print("Enter breadth of Box "+i+" : ");
			int b=sc.nextInt();
			//calculating area of each object
			box_array[i-1]=new Box(l,b);
			System.out.print("Area of Box "+i+" : "+box_array[i-1].area()+"\n\n");
		}
	}
}