import java.io.*;
import java.util.*;

public class LambdaExpression{
	public static void main(String[] args){
		
 List<String>list =new ArrayList<String>();
 
 list.add(" Sir");
 list.add(" I am");
 list.add("a");
 list.add(":");
 list.add(" Raghu ");
 list.add("a");
 list.add(" MCA");
 list.add("h");
 list.add("u");
 list.stream()
		.filter(n->n.length()>3).forEach((n)->System.out.println(n));
}
}
	
	
