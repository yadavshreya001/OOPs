package polymorphism.methodOverriding;

public class Test {
    void show(){
        System.out.println("Hello World");
    }
}

class exam extends Test{
    @Override
    void show(){
        System.out.println("Hello there :) ");
    }
    public static void main(String[] args) {
//        Test test = new Test();
//        test.show();
        exam exam = new exam();
        exam.show();
    }
}
