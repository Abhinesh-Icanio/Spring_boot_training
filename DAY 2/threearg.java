
// Create a function with 3 Arguments
//1st Arugument Should be an Integer
//2nd Argument Should Be String
//3rd Argument Should be a User Define Class

import java.io.*;
import java.util.*;

class threearg{
	 public static void main(String[] args){
		 int id;
		 String name;
		 userdefined ud= new userdefined();
		 
		 Scanner s= new Scanner(System.in);
		 System.out.println("Student_Id:");
		 id = s.nextInt();
		 s.nextLine();
		 System.out.println("Student_Name:");
		 name = s.nextLine();
		 
		 method(id,name,ud);
	 }
	  
	  public static void  method(int id, String name, userdefined ud){
		 ud.userdefined(id,name);

}
}
 
 class userdefined{
	 
	void userdefined(int id, String name){
	     String l;
	     Scanner s= new Scanner(System.in);
		 System.out.println("Location:");
		 l = s.nextLine();
		 System.out.println(".......................");
		 System.out.println("  ");
		 System.out.println("Student details : ");
		 System.out.println("Id: " + id);
		 System.out.println("Name: " +  name);
		 System.out.println("Location: " + l);
		 
		 
		 
	}
	

 }