package lesson2;

import java.time.LocalTime;
import java.util.List;

public class LessonTwo {

    public static void exerciseTwo() {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Олег", "Иванов", "Васильевич", "Старший специалист", "1234@bk.ru", "89006785432", 23000, 45);
        persArray[1] = new Employee("Михаил", "Вилков", "Викторович", "Менеджер", "Michael@ya.ru", "89763451209", 56000, 31);
        persArray[2] = new Employee("Федор", "Заносов", "Иванович", "Слесарь", "Pochta@ya.ru", "89107895412", 40000, 56);
        persArray[3] = new Employee("Мария", "Бугрова", "Алексеевна", "Секретарь", "ler@ya.ru", "89996543098", 50000, 28);
        persArray[4] = new Employee("Ольга", "Афанасьева", "Петровна", "Бухгалтер", "Jump@ya.ru", "89700761209", 70000, 39);
        for (int i = 0; i < persArray.length; i++) {
            System.out.println(persArray[i]);
        }
    }

    public static void exerciseThree() {
        Attraction attraction1 = new Attraction("Карусель", LocalTime.MIDNIGHT, LocalTime.NOON, 100);
        Attraction attraction2 = new Attraction("Горки", LocalTime.MIDNIGHT, LocalTime.NOON, 200);
        List<Attraction> attractions = List.of(attraction1, attraction2);
        Park park = new Park(attractions);
        System.out.println(park);
    }
}
