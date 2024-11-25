package inheritance.singleInheritance;

public class A {
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");
    }
    public static void main(String[] args) {
        A a = new A();
        a.showA();

        B b = new B();
        b.showB();
        b.showA();
    }
}

