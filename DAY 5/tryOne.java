import java.io.*;


class B{
	
	public static void method() throws ArithmeticException,NumberFormatException,ArrayIndexOutOfBoundsException {
	
	int a = 30, b = 2;
            int c = a/b;  
            System.out.println ("Result = " + c);
			
			int n[] = new int[10];
            n[8] = 9;
			System.out.println(n[4]);
			
			//int num = Integer.parseInt("abc");
			//int num = 2;
			System.out.println(num);
			
}

}


public class tryOne {
	
	public static void main(String[] args){
		try{
	    B.method();
		}
		catch(Exception e)
		{ System.out.println(e);
		}
		
	
	}	
}