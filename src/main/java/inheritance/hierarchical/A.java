package inheritance.hierarchical;

public class A {
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A {
    void showB(){
        System.out.println("B class method");
    }
}

class C extends A {
    void showC(){
        System.out.println("C class method");
    }
    public static void main(String[] args) {
       A a = new A();
        a.showA();
        System.out.println("----------------------------");

        B b = new B();
        b.showB();
        b.showA();
        System.out.println("----------------------------");

        C c = new C();
        c.showA();
        c.showC();
    }
}


