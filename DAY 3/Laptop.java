import java.io.*;

 class Parent{ 
    
	int method(int a, int b){
		return a+b;
		
	}
	void method(){
		System.out.println("Parent");
	}
	 
	 }
 class Child extends Parent{
	 
	 int method(int a , int b){
	 return  a-b;
	 }
	 void method(){
		 System.out.println("Child");
	 }
 }
 
 
 public class Laptop {
    public static void main(String[] args){
	 		System.out.println("\nMETHOD OVERLOADING / OVERRIDING" + "\n..........................\n");

	 Parent p = new Parent();
	 Parent c = new Child();
	 System.out.println(p.method(5,10));
	 p.method();
	 
     System.out.println(c.method(5,10));
	 c.method();
	
		
	}
}		
		  
		  
		  
 
 
