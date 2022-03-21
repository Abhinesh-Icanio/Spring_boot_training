import java.io.*;
public class ThreadInterface implements Runnable {  
   int a = 2;
   int b = 4;
   
    public void run() {  
	try{
		if (b%a == 0){System.out.println("Thread Interface Occurs.**.**.");
		
		Thread.sleep(1000);
		System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");Thread.sleep(1000);
		Thread.sleep(1000);System.out.println("!!!!!!!");
		Thread.sleep(500);Thread.sleep(500);System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");
		Thread.sleep(500);Thread.sleep(500);	System.out.println("!!!!!!!");
		Thread.sleep(400);Thread.sleep(400);System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");
		Thread.sleep(200);
		System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");
		Thread.sleep(100);
		System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");
		Thread.sleep(100);System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");System.out.println("!!!!!!!");System.out.println("Thread..!@#$%^&*()(*&^%$#@#$%^&*()(*&^%$#@#$%^&*");
		Thread.sleep(100);System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");
		Thread.sleep(100);
		System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");
		Thread.sleep(10);
		System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");System.out.println("!!!!!!!");
		}
		}catch(Exception e){}
          
    }  
   
    public static void main(String[] args) {  
  
        Thread thread= new Thread( new ThreadInterface());  
        thread.start();  
        System.out.println("Interface:");  

    }  

}