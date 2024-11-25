package polymorphism.methodOverloading;

public class Test {

    void show(){
        System.out.println("1");
    }
    void show(int a , String b){
        System.out.println("2");
    }
    void show(String a , int b){
        System.out.println("3");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(10 , "adn");
    }
}


