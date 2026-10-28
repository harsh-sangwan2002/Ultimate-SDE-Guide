class Parent {

    public String name = "Parent";
    protected int age = 22;
    private String secret = "secret code";
    String city = "Rohtak";

    static int count = 0;

    {
        System.out.println("Parent instance block");
    }

    static {
        System.out.println("Parent static block");
        count = 10;
    }

    public Parent() {
        count++;
        System.out.println("Parent constructor");
    }

    public void showSecret() {
        System.out.println(secret);
    }

    public static void showCount() {
        System.out.println("Count: " + count);
        // Cannot directly access instance variables here
    }
}

class Child extends Parent {
    private int marks = 90;

    // Instance method
    public void display(int age) {
        int local = 100; // Local variable

        System.out.println(name); // Public: accessible
        System.out.println(this.age); // Protected inherited field
        System.out.println(city); // Default: same package
        System.out.println(marks); // Private field in Child
        System.out.println(age); // Method parameter
        System.out.println(local); // Local variable

        // System.out.println(secret); // Error: private in Parent
        // System.out.println(this.count); // Compiles, but prefer Parent.count
    }

    public static void childMethod() {
        System.out.println("Child static method");
        // System.out.println(marks); // Error: instance field
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main starts");

        Child c1 = new Child();
        Child c2 = new Child();

        c1.display(25);
        c1.showSecret();

        Parent.showCount();
        Child.childMethod();

        c1.name = "Aman";
        System.out.println(c2.name); // Parent

        System.out.println(Parent.count);
    }
}