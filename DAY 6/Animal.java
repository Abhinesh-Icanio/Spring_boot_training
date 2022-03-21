import java.io.*;
 
import Animals.*; // using * 

import Animals.Dog.Doberman; //Using the Classname 

public class Animal{

public static void main(String[] args){
	
	
Beast type = new Beast();
	System.out.println("Animal Type :" + type.animalType()); 
	
	
	Doberman dog = new Doberman();
	System.out.println("Dog Name :" + dog.dogName());
	
	Animals.Cat.Persian obj = new Animals.Cat.Persian();	 //Fully Qualified Name
	 System.out.println("Cat Name :" + obj.catName());

	
}
}