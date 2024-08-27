public class ObjectArraytoMethod {
       public static void main(String[] args) {
            Student[] student = new Student[3];
            student[0] = new Student();
            student[0].setName("Tom", 59);
            student[0].getName();
            student[1] = new Student();
            
       }
}

class Student {
    private String name;
    private int rollNo;
    static private String college = "UCB";

    public Student() {

    }

    public void getName() {
        System.out.println("Student name is " + this.name + " and RollNo is " + this.rollNo + ". Study in the " + Student.college);
    }

    public void setName(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
