package Static;

public class InnerClass {

    /**
     * Static Inner class cannot access non-static (instance) data member or method.
     * Static Inner class depends on the object of the outer class.
     */
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test("Kunal");
        Test obj2 = new Test("Rahul");

        // We can use static inner class without the object of the outer class
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
