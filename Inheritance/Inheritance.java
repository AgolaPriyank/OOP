/**
 * Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).
 * The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.
 * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
 */

/**
 * Single Inheritance
 */

package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Mark", 19, 10000.0f, "Mumbai", 5000.0f);
        p1.getDetails();
        System.out.println(p1.bonus);

        //Here, we can initialise bonus but we cannot access 
        //Parent class refrencing to the child class
        //But child ref var and parent object is not allowed 
        Employee e1 = new Programmer("Steve", 20, 50000.0f, "California", 3000.0f);
        e1.getDetails();
    }
}

class Employee {
    String name;
    int age;
    float salary;
    String city;

    public void getDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary + ", City: " + this.city);
    }

    public Employee(String name, int age, float salary, String city) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
    }

    public void setDetails(String name, int age, float salary, String city) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
    }
}

class Programmer extends Employee {
    float bonus;

    public Programmer(String name, int age, float salary, String city, float bonus) {
        //Used to initialise values of parent class
        //Call the parent class constructor
        super(name, age, salary, city);
        this.bonus = bonus;
    }
}


