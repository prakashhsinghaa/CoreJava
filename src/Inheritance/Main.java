package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal",1,1,5,30);
        Dog dog = new Dog("labra",20,30,2,4,1,28,"Silky");
        //dog.eat();
//        dog.walk();
//        dog.run();
        Fish fish = new Fish("salmon",5,2,4,2,4);
        fish.swim(3);
    }
}
