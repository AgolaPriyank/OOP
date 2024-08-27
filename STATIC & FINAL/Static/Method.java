package Static;

/**
 * Static member only access static data
 * A static method belongs to the class rather than the object of a class.
 * A static method can be invoked without the need for creating an instance of a class.
 * A static method can access static data member and can change the value of it. 
 */

public class Method {
    public static void main(String[] args) {
        // We can not use non-static method inside the static method
        // Greeting();
        fun();

        // That's why we can say non-static is object dependent
        Method obj = new Method();
        obj.Greeting();
    }

    //This is not depend on object
    static void fun() {
        // We can not use non-static member inside static member
        // Greeting();
        System.out.println("I'm not funny at all");
    }

    //This is depend on object
    void Greeting() {
        // We can use static member inside non-static member
        // fun();
        System.out.println("Hello Java");
    }
}

class Student {
    String name;
    int age;
    float SPI;
    static String collageName;
    String Department;

    static void get() {
        // We can't use 'this' keyword inside the static method because this keyword refrence to the object.
        // System.out.println("Student name is: " + this.name);
    }
    
}