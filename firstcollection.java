import java.util.*;
import java.util.Map;
import java.util.HashMap;

class Employee {

    int empid;
    String empname;
    String designation;
    double salary;

    Employee(int empid, String empname, String designation, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
    }
}

public class firstcollection {
    public static void main(String[] args) {

        HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
        Employee e = new Employee(111, "Iniyaal", "HR", 25000.00);
        Employee e1 = new Employee(112, "Navin", "HR", 26000.00);
        Employee e2 = new Employee(113, "Harish", "HR", 27000.00);
        Employee e3 = new Employee(114, "Vijay", "HR", 28000.00);
        hm.put(1, e);
        hm.put(2, e1);
        hm.put(3, e2);
        hm.put(4, e3);
        for (Map.Entry<Integer, Employee> entry : hm.entrySet()) {
            int key = entry.getKey();
            Employee a = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println("Empid: " + a.empid + " " + "Empname: " + a.empname + " " + "Designation "
                    + a.designation + " " + "Salary: " + a.salary);
        }
        hm.remove(3);
        System.out.println("After deletion");
        for (Map.Entry<Integer, Employee> entry : hm.entrySet()) {
            int key = entry.getKey();
            Employee a = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println("Empid: " + a.empid + " " + "Empname: " + a.empname + " " + "Designation "
                    + a.designation + " " + "Salary: " + a.salary);
        }
        if (hm.containsValue(e3)) {
            System.out.println("the value is available");

        } else

        {
            System.out.println("the vaule is not availble");
        }
        hm.replace(2, e1, e3);
        System.out.println("After relacing");

        for (Map.Entry<Integer, Employee> entry : hm.entrySet()) {
            int key = entry.getKey();
            Employee a = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println("Empid: " + a.empid + " " + "Empname: " + a.empname + " " + "Designation "
                    + a.designation + " " + "Salary: " + a.salary);
        }
    }
}