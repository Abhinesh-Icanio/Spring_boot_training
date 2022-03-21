import javax.annotation.processing.Generated;

public class Employee {

    public int id;
    public String name;

    public String location;

    public Employee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }





    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}