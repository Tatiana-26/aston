import lesson1.LessonOne;
import lesson2.Employee;
import lesson2.LessonTwo;
import lesson2.Park;
import lesson4.LessonFour;
import lesson4.exceptions.MyArrayDataException;
import lesson4.exceptions.MyArraySizeException;

import java.time.LocalTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LessonOne.printThreeWords();
//        LessonOne.checkSumSign();
//        LessonOne.printColor();
//        LessonOne.compareNumbers();
//        boolean b = LessonOne.exerciseFive();
//        LessonOne.exerciseSix(78);
//        boolean c = LessonOne.exerciseSeven(35);
//        LessonOne.exerciseEight();
//        boolean e = LessonOne.exerciseNine(1989);
//        LessonOne.exerciseTen();
//        LessonOne.exerciseEleven();
//        LessonOne.exerciseTwelve();
//        LessonOne.exerciseThirteen();
//        LessonOne.exerciseFourteen(3, 5);
//        Employee employee = new Employee("FN", "LN", "MN", "JT",
//                "EMAIL", "123456", 10000, 35  );
//        employee.printEmployee(employee);

//       Attraction attraction1 = new Attraction("Карусель", LocalTime.MIDNIGHT, LocalTime.NOON, 100);
        //      Attraction attraction2 = new Attraction("Горки", LocalTime.MIDNIGHT, LocalTime.NOON, 200);
        //    List<Attraction> attractions = List.of(attraction1, attraction2);
        //       Park park = new Park(attractions);
        //      System.out.println(park);
//        LessonTwo.exerciseTwo();
//        LessonTwo.exerciseThree();

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] wrongSize = {
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSdata = {
                {"1", "2", "3", "ggg"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            LessonFour.createArray(correctArray);
        } catch (MyArraySizeException exception) {
            System.out.println("ОШИБКА: Размер массива не 4х4");
        } catch (MyArrayDataException ex) {
            System.out.println("ОШИБКА: " + ex.getMessage());
        }

    }
}

