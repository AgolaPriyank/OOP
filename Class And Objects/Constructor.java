//https://www.javatpoint.com/java-constructor

/*
 * If there is no constructor in a class, compiler automatically creates a default constructor.
 * A constructor is called "Default Constructor" when it doesn't have any parameter.
 * The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
 * A constructor which has a specific number of parameters is called a parameterized constructor.
 * Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
 */

/**
 * Constructor
 */
public class Constructor {

    public static void main(String[] args) {
        //calling a default constructor  
        Student s1 = new Student();

        /*
         * Student s2 and s3 is example of constructor overloading.
         * s2 with 3 parameters and s3 with 2 parameters.
         */
        Student s2 = new Student("Divyrajsinh", 19, 98.5f);
        Student s3 = new Student("Steve", 20);
    }    
}

class Student {
    String name;
    int age;
    float marks;
    //A constructor is called "Default Constructor" when it doesn't have any parameter.
    Student() {
        System.out.println("Student is Created with Default Constructor.");
    }

    //Creating a parameterized constructor
    Student(String _name, int _age, float _marks) {
        name = _name;
        age = _age;
        marks = _marks;
        System.out.println("Student is created using parameterized constructor.");
    }

    Student(String _name, int _age) {
        name = _name;
        age = _age;
    }

}