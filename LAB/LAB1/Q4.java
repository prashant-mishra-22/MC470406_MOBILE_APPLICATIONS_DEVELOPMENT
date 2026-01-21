//.write a program to create an ArrayList  of string and use its common functions like add,get,clear,size ,isempty

//imports
import java.util.ArrayList;
//main method
public class Q4{
	public static void main(String[] args){
		//new ArrayList
		ArrayList<String> a1=new ArrayList<String>();
		//add() function
		a1.add("AI");a1.add("DBMS");
		//size function
		System.out.println("Elements in the ArrayList : "+a1.size());
		//get() function
		System.out.println("Element at index 0 : "+a1.get(0));
		System.out.println("Element at index 1 : "+a1.get(1));
		//clear() function
		a1.clear();
		//size function
		System.out.println("Elements in the ArrayList : "+a1.size());
		//add() function
		a1.add("Java");a1.add("ML");
		//size function
		System.out.println("Elements in the ArrayList : "+a1.size());
		//get() function
		System.out.println("Element at index 0 : "+a1.get(0));
		System.out.println("Element at index 1 : "+a1.get(1));
		//isEmpty() function
		System.out.println("Is the ArrayList is Empty : "+a1.isEmpty());
	}
}		