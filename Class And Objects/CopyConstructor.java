/*
 * There are many ways to copy the values of one object into another in Java. They are:
    -By constructor
    -By assigning the values of one object into another
    -By clone() method of Object class
 */

/**
 * CopyConstructor
 */
public class CopyConstructor {

    public static void main(String[] args) {
        /*
         * This is example of copy constructor using anothor constructor.
         */
        Student s1 = new Student("Divyrajsinh", 19, 97.6f);
        Student s2 = new Student(s1);
        System.out.println(s1.name);
        System.out.println(s2.name);

        /*
         * Copying value without constructor
         */
        Student s3 = new Student("Elon", 56, 99.9f);
        Student s4 = new Student();
        s4.name = s3.name;
        System.out.println(s3.name);
        System.out.println(s4.name);
    }
}

class Student {
    String name;
    int age;
    float marks;

    Student() {
        name = null;
        age = 0;
        marks = 0;
    }

    Student(String _name, int _age, float _marks) {
        name = _name;
        age = _age; 
        marks = _marks;
    }

    Student(Student S) {
        name = S.name;
        age = S.age;
        marks = S.marks;
    }
}
