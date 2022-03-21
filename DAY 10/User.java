import java.util.HashMap;
import java.util.Map;

public class User {


    public User(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "companyName='" + companyName + '\'' +
                '}';
    }

    private String companyName;



    public static void main(String[] args){

        Employee emp1 = new Employee(1 ,"Balaji","TVL");
        Employee emp2 = new Employee(2 ,"Livingston","Chennai");
        Employee emp3 = new Employee(3 ,"Rahu","USA");




        User user1 = new User("Icanio");
        User user2 = new User("tcs");
        User user3 = new User("Wipro");


        Map<Employee, User> map= new HashMap<Employee, User>();
        map.put(emp1 , user1);
        map.put(emp2 , user2);
        map.put(emp3 , user3);

        System.out.println(map.get(emp1));

       // for(Map.Entry<Employee,String> entry : map.entrySet()){

      //      System.out.println(entry.getKey() + "....." + entry.getValue());
        }}



