package objectInitialization.constructor.parameterizedConstructor;

public class Test {

    public Test(String name) {
        System.out.println("This is a parameterized constructor");
    }
    public static void main(String[] args) {
        Test test = new Test("Shreya");
    }
}


