package lesson3;

import lesson3.animals.Animal;
import lesson3.animals.Cat;
import lesson3.animals.Dog;
import lesson3.animals.Plate;
import lesson3.figure.Circle;
import lesson3.figure.CircleServiceImpl;
import lesson3.figure.Figure;
import lesson3.figure.FigureService;
import lesson3.figure.Rectangle;
import lesson3.figure.RectangleServiceImpl;
import lesson3.figure.Triangle;
import lesson3.figure.TriangleServiceImpl;

import java.util.List;

public class LessonThree {
    public static void runLesson3() {
//
        Animal dog = new Dog();
        dog.run(100);
        dog.run(600);
        dog.swim(300);
        dog.swim(8);
        Animal cat = new Cat();
        cat.run(100);
        cat.run(201);
        cat.swim(300);

        Plate.addFood(30);


        List<Animal> cats = List.of(new Cat(), new Cat(),
                new Dog(),new Dog(),new Dog(),
                new Animal());

        cats.forEach(cat1 -> {
            cat1.eat(10);
            System.out.println(cat1);
            System.out.println(Plate.getPlateCount());
        });

        countAnimalTypes(cats);

        Circle circle = new Circle("red", "white", 5);
        FigureService<Circle> circleFigureService = new CircleServiceImpl();
        double circleArea = circleFigureService.countArea(circle);
        double circleLength = circleFigureService.countLength(circle);
        circle.setArea(circleArea);
        circle.setLength(circleLength);
        System.out.println(circle);


        Rectangle rectangle = new Rectangle("red", "white", 5, 10);
        FigureService<Rectangle> rectangleFigureService = new RectangleServiceImpl();
        double rectangleArea = rectangleFigureService.countArea(rectangle);
        double rectangleLength = rectangleFigureService.countLength(rectangle);
        rectangle.setArea(rectangleArea);
        rectangle.setLength(rectangleLength);
        System.out.println(rectangle);

        Triangle triangle = new Triangle("red", "white", 5, 7, 9);
        FigureService<Triangle> triangleFigureService = new TriangleServiceImpl();
        double triangleArea = triangleFigureService.countArea(triangle);
        double triangleLength = triangleFigureService.countLength(triangle);
        triangle.setArea(triangleArea);
        triangle.setLength(triangleLength);
        System.out.println(triangle);

    }


    private static void countAnimalTypes(List<Animal> animalList) {
        int numOfAnimals = 0;
        int numOfDogs = 0;
        int numOfCats = 0;
        for (Animal animal : animalList) {
            if (animal instanceof Dog) {
                numOfDogs++;
            } else if (animal instanceof Cat) {
                numOfCats++;
            } else if (animal instanceof Animal) {
                numOfAnimals ++;
            }
        }
        System.out.println("Количество собак " + numOfDogs);
        System.out.println("Количество кошек " + numOfCats);
        System.out.println("Количество животных " + numOfAnimals);

    }

}