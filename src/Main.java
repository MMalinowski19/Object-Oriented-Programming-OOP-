import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Vehicle.Car;
import Vehicle.Tank;
import abc.A;
import abc.C;

public class Main {
    public static void main(String[] args) {

        //dziedziczenie

        //single
        Car car = new Car();
        car.setEnginePower(500);
        car.setNumberOfWheels(5);
        car.setName("Porshe");

        //Multilevel
        C c = new C();
        c.setC(12);
        c.setA(11);
        c.setB(13);

        //Hierarchical
        Tank tank = new Tank();
        car.setName("Mercedes");
        tank.setName("Leopard");
        car.setNumberOfWheels(4);
        tank.setNumberOfCatterpillars(2);

        //POLIMORFIZM
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.speak();
        dog.speak();
        cat.speak();

    }
}