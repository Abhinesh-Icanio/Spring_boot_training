import java.io.*;
 
 
   abstract class cOne{
	 abstract void operation();
  }
  class Addition extends cOne{
	
	void operation(){
	  System.out.println("a+b");
	  }
  }
  class Subtraction extends cOne{
	
	  void operation(){
	  System.out.println("a-b");
	  }
  }
 
 class Abs{
 public static void main(String[] args){
    cOne add = new Addition();
    cOne sub = new Subtraction();
    add.operation();
   	sub.operation();
 
 }
 }