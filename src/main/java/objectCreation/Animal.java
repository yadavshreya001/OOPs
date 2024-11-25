package objectCreation;

class Bird{
    public void fly(){
        System.out.println("Birds flying");
    }
}
class Animal {
    public void eat(){
        System.out.println("I am eating ...");
    }
    public void run(){
        System.out.println("I am running ...");
    }
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();

        Bird bird = new Bird();
        bird.fly();
    }
}


