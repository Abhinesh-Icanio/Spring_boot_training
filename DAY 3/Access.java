import java.io.*;

class Access extends Specifier{
 
public static void one(){
	System.out.println("ONE");
} 
private static void two(){
		System.out.println("TWO");

}
	
	
public static void main(String[] args){
		System.out.println("Access Specifier : ");
		one();
		two();
		Access s = new Access();
		s.three();
		s.four();
		//s.five();
		System.out.println(s.six());
	

	
	
}} 






