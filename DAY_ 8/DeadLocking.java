//Deadlocking with use of Main Thread(only single thread)

import java.io.*;

public class DeadLocking{
	
	public static void main(String[] args){
		
		Thread thread = Thread.currentThread();
		System.out.println("It is " + thread.getName() + " Thread");
	try{
		thread.join(1000);  
	}catch(Exception e){}
		System.out.println( "It is " + thread.getName() + " Threads");

	}
	}
