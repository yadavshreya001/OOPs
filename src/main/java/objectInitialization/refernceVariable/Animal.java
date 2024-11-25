package objectInitialization.refernceVariable;

public class Animal {
    int age;
    String colour;
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 10;
        animal.colour = "black and white";
        System.out.println("The age is: " + animal.age);
        System.out.println("The colour is: " + animal.colour);
    }
}
