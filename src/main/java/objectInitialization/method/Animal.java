package objectInitialization.method;

public class Animal {
    String colour;
    int age;

    void initObj(String a , int b){
        colour = a;
        age = b;
    }
    void display(){
        System.out.println(colour + " " + age);
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.initObj("Black and brown" , 10);
        animal.display();
    }
}



