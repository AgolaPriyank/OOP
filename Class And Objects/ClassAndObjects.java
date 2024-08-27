//https://www.javatpoint.com/object-and-class-in-java

/**
 * ClassAndObjects
 */
public class ClassAndObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        //Initialization through reference
        s1.name = "Joe";
        System.out.println(s1.name);

        //Intitalization through method
        Faculty f1 = new Faculty();
        f1.insertRecord("David", 46, "Computer");
        f1.displayData();
    }
}

class Student {
    String name;
    int rollNo;
    int marks;
}

class Faculty {
    String _name;
    int _age;
    String _department;
    //This is method
    void insertRecord(String name, int age, String department) {
        _name = name;
        _age = age;
        _department = department;
    }
    void displayData(){
        System.out.println("Faculty name is " + _name + ", they are " + _age + " old and they are work in " + _department + " Department.");
    }
}