//Create a fuction with return type Boolean

import java.io.*;
import java.util.*;

class b_datatype{
	
	public static boolean abe(int i){
		if(i<100 && i>50)
			return true;
		else
			return false;
	}
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter i value:");
	System.out.println(abe(s.nextInt()));
}
			
}	