/*
 * If you make any variable as final, you cannot change the value of final variable(It will be constant).
 * If you make any method as final, you cannot override it.
 * If you make any class as final, you cannot extend it.
 */


/**
 * Final
 */
public class Final {

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student {
    final String NAME = "Tanmay";
    final void setName() {
        // It can't be changed because final variable once assigned a value can never be changed.
        // name = "Tanmay";
    }
}

class CSstudent extends Student {
    //final method is inherited but you cannot override it
    // void setName() {

    // }
}

final class Faculty {
    String name;
}

// class CSfaculty extends Faculty {

// }


