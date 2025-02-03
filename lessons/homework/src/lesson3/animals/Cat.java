package lesson3.animals;

public class Cat extends Animal{
    private boolean isFull = false;


    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Кошка столько не пробежит");
        } else {
            System.out.println("Кошка пробежала " + distance +"м.");
        }
    }

    public void eat(int foodCount) {
        try {
            Plate.eatFood(foodCount);
            isFull = true;
        } catch (RuntimeException ex) {
            System.out.println("В миске недостаточно корма");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isFull=" + isFull +
                '}';
    }
}
