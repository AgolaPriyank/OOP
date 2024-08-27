/**
 * When there is a chain of inheritance, it is known as multilevel inheritance. 
 */

package Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        BackendDeveloper b1 = new BackendDeveloper();
        b1.setDetails("Kunal", 21, 90000.0f, "kolkata");
        b1.getDetails();
        System.out.println(b1.workLocation);
        System.out.println(b1.skill);
    }
}

class Employee {
    String name;
    int age;
    float salary;

    public void setDetails(String name, int age, float salary, String city) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary);
    }
}

class Programmer extends Employee {
    float bonus = 10000.0f;
    String workLocation = "San Diago";
}

class BackendDeveloper extends Programmer {
    String skill = "node.js, Express.js, React.js, MongoDB";
}
