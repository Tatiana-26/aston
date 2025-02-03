package lesson3.animals;

public class Dog extends Animal{
    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака столько не проплывает");
        } else {
            System.out.println("Бобик проплыл " + distance +"м.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака столько не пробежит");
        } else {
            System.out.println("Бобик пробежал " + distance +"м.");
        }
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
