/*
 * It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.
 */

/**
 * This
 */
public class This {

    public static void main(String[] args) {
        Student s1 = new Student("Divyrajsinh", 19, 97.8f);
        s1.display();
        Student s2 = new Student("David", 21, 99.8f, "CS");
        s2.display();
    }
}

class Student {
    String name;
    int age;
    float marks;
    String department;

    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    /*
     * Constructor Chaining
     * Call to this() must be the first statement in constructor.
     */
    Student(String name, int age, float marks, String department) {
        this(name, age, marks);
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Marks: " + this.marks);
    }
}
