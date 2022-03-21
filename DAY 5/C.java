import java.io.*;
import java.util.*;

class MyEx extends Exception{
	MyEx(String s){
		super(s);
	}
	MyEx(){
		super("\tNot Your ");
	}
}

public class C{
	
	
	public static void main(String[] args){
	
	Scanner sc =new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	try{
		if(a != b) throw new MyEx("\tNot Your   ");
		
	}catch(Exception e){
	System.out.println(e.getMessage() + "EX");
	}
	finally { 
	System.out.println("\tDone");
	}
}
}