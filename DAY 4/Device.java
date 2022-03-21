import java.io.*;


interface Laptop{
	void desk();
}
interface Mobile{
	void mob();
}


class Device implements Laptop, Mobile{
	public void desk(){
		System.out.println("Dell , Macbook , ASUS");
	}
	public void mob(){
		System.out.println("RedMI, Apple , LG");
	}
	
	public static void main(String[] args){
		Device d = new Device();
		d.desk();
		d.mob();
	}
}