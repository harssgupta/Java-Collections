import java.util.*;
class Employees {
    String name;
    int age;
    String designation;
    int salary;
    Employees(String name,int age,String designation,int salary) {
        this.name=name;
        this.age=age;
        this.designation=designation;
        this.salary=salary;
    }
}
public class ques4 {
    public static void main(String[] args) {
        Employees employee1 = new Employees("Harsh Gupta", 22, "SE", 50000);
        Employees employee2 = new Employees("Mayank Gupta", 28, "SSE", 65000);
        Employees employee3 = new Employees("Nikhil Gupta", 30, "ATL", 75000);
        Map<Employees, Integer> map1 = new HashMap<>();
        map1.put(employee1, employee1.salary);
        map1.put(employee2, employee2.salary);
        map1.put(employee3, employee3.salary);
        for (Map.Entry<Employees, Integer> map2 : map1.entrySet()) {
            Employees employee = map2.getKey();
            System.out.println(map2.getKey() + " " + employee.name + " " + "Age:" + employee.age + " " + "Designation:" + employee.designation + " Salary: " + map2.getValue());
        }
    }
}