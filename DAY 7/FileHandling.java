import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class FileHandling{
public static  void main(String[] args){
	try{
	//File myFile = new File("C:\\Users\\DELL\\Desktop\\Work\\DAY 7\\BucketList2.txt");
	FileWriter myBucketList1 = new FileWriter("BucketList1.txt");
	myBucketList1.write("\t BucketList :  \n \t* Restaurant  \n \t* Sky Diving \n \t* World Tour");
	myBucketList1.close();
	
	FileReader myReader = new FileReader("BucketList1.txt");
	FileWriter myBucketList = new FileWriter("BucketList2.txt");
	  String storage = "";
	  
	  int value;
	   while ((value = myReader.read()) != -1) {
  
                // Storing every character in the string
                storage += (char)value;
            }
			System.out.println(storage);
			myBucketList.write(storage);
			myBucketList.close();
			myReader.close();
		File myFile = new File("BucketList1.txt");
		if (myFile.createNewFile()){ 
        System.out.println("File created: " + myFile.getName());
		}else{
			myFile.delete();
			System.out.println("\n File deleted");

		}
		
         System.out.println("\n All done!!!");
	}
   catch(Exception e){
   System.out.println("Sorry!! Something Went Wrong");
   e.printStackTrace();
}

}
}