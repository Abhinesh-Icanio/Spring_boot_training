import java.io.*;
import java.util.*;


public class ArrI{
	
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,6};
	Scanner s = new Scanner(System.in);
	int a =s.nextInt();
	int b =s.nextInt();
		try{
			
			System.out.println("\ta :" + a );
		     System.out.println("\tb :" + b);
		
		
		int ans = (arr[b]/arr[a]);
		System.out.println("Ans :" + ans);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("\nOut Of Bound" + e);
			
		}
	}
		
	
	
}