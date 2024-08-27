/**
 * When two or more classes inherits a single class, it is known as hierarchical inheritance. 
 */

package Inheritance;

public class HirachialInheritance {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        DBAdmin d1 = new DBAdmin();
        p1.setDetails("Mark", 49, 100000.0f, "California");
        p1.getDetails();
        System.out.println("Bonus: " + p1.bonus + ", Work Location: " + p1.workLocation);
        d1.setDetails("Steve", 56, 50000.0f, "San Fransisco");
        d1.getDetails();
        System.out.println("Bonus: " + d1.bonus + ", Work Location: " + d1.workLocation);
    }
}

class Employee {
    String name;
    int age;
    float salary;
    String city;

    public void setDetails(String name, int age, float salary, String city) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
    }

    public void getDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary + ", City: " + this.city);
    }
}

class Programmer extends Employee {
    float bonus = 10000.0f;
    String workLocation = "San Diago";
}

class DBAdmin extends Employee {
    float bonus = 5500.0f;
    String workLocation = "Mumbai";
}

