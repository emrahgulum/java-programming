package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();
    }
}
