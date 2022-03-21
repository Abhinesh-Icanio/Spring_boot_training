//Create a function with One Argument
   //Argument Should be a List of String
import java.io.*;
import java.util.*;

class listargs{
	public static void output(ArrayList<String> fruits){
		System.out.println("List of Fruits : ");
		for(String fruit : fruits){
			System.out.println(fruit);
		}
	}
	
	
	
	public static void main(String[] args){
	ArrayList<String> fruits = new ArrayList<>();
	fruits.add("apple");
	fruits.add("orange");
	fruits.add("mango");
	
	output(fruits);
	
	}

}