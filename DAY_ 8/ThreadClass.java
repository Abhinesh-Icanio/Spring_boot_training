import java.io.*;

class Threading extends Thread{
public void run(){
	try{
		for(int i =0;i<10;i++){
	System.out.println(i<5);
	Thread.sleep(1000);
	System.out.println(i>5);
	Thread.sleep(500);
	}}catch(Exception e){}
	
	}
}


public class ThreadClass{
	public static void main(String[] args){
		
		Threading threading = new Threading();
		
		threading.run();
		
	}
	
}