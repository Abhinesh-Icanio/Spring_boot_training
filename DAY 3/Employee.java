
import java.io.*;
 
public class Employee{
	
	int id;
	int salary;
	String name;
	String location;
	 
	Employee(){}
	 
	Employee( String name, int id ){
		this.id = id ;
		this. name = name;
		System.out.println("\nParameterized Constructor :");
	}
       Employee( int salary, String location){
		//   this("hari",1);
		   this.salary = salary;
		   this.location = location;
		   
	   }
	   
	   
	   
	   public static void main(String[] args){
	   System.out.println("Employee Details :" + "\n*...........................*");
	    
		Employee E = new Employee();
	   	System.out.println("Default Constructor" + "\n*..............................*");

	    Employee E1 = new Employee("hari",01);
	    System.out.println("Employee Id : " + E1.id + "\nEmployee Name : " + E1.name);
	   
	   
	   
	   Employee E2 = new Employee(50000,"Tirunelveli");
	   System.out.println("Employee Salary : " + E2.salary + "\nEmployee Location : " + E2.location );

	   
	   }







}