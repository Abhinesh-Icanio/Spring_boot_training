import java.io.*;

public class GarbageCollection{

protected void finalize(){
	        System.out.println("These Are Garbages");
			}
			
	public static void main(String[] args){
		
	GarbageCollection garbageOne = new GarbageCollection();
	GarbageCollection garbageTwo = new GarbageCollection();
	GarbageCollection garbageThree = new GarbageCollection();
	GarbageCollection garbageFour = new GarbageCollection();	
	GarbageCollection garbageFive = new GarbageCollection();
		
		garbageOne = garbageFive;
		garbageTwo = null;
		garbageThree = null;
		garbageFour = null;
		System.gc();

		
	}
}