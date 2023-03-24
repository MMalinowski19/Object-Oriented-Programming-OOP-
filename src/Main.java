import OverridingAnimals.Animal;
import OverridingAnimals.Dog;

public class Main {
    public static void main(String[] args) {

        //OVERRIDING
        Dog dog = new Dog();
        Animal animal = new Animal();
        System.out.println(dog.speak());
        System.out.println(animal.speak());
    }
}