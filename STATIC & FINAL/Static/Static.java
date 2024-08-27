package Static;
/*
 * The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
 */

/**
 * Static
 */
public class Static {

    public static void main(String[] args) {
        Student s1 = new Student("Divyarjsinh", 59);
        Student s2 = new Student("Priyank", 2);
        System.out.println(Student.college);
        s1.display();
        s2.display();
    }

    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

    public void setTitle(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }
}

class Student {
    String name; //instance variable
    int rollNo;
    static String college ="UCB"; //static variable  
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println(name + " " + rollNo + " " + college);
    }
}