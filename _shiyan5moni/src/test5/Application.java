package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 23:15
 */
abstract class Animal{
    abstract public void cry();
    abstract public String getAnimalName();
}
class Simulator{
    public void playSound(Animal animal){
        animal.cry();
        System.out.println(animal.getAnimalName());
    }

}
class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("汪汪汪~");
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }
}
class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("喵喵喵~");
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }
}
public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}
