//Create a function with Return Type User Defined Class

import java.io.*;
import java.util.*;

class function{
	 public static void main(String[] args){
		 int a;
		 int b;
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter the values of a:");
		 a = s.nextInt();
		 System.out.println("Enter the values of b:");
		 b = s.nextInt();
		 input(a,b);
	 } 
	 
	 	 public static userdefinedclass input(int a, int b){
		 userdefinedclass i = new userdefinedclass(a,b);
		 return i;
	 }
}


	  class userdefinedclass {
		  int a;
		  int b;
		 
		  userdefinedclass(int a, int b){
			  int c = (a+b)*(a-b);
			  System.out.println(c);
		  }
		 
	  } 