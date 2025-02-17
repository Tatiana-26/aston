package lesson4;

import lesson4.exceptions.MyArrayDataException;
import lesson4.exceptions.MyArraySizeException;

public class LessonFour {

    public static void createArray(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    Integer value = Integer.valueOf(array[i][j]);
                    count = count + value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Ошибка при парсинге ячейки %s-%s со значением %s", i, j, array[i][j]));
                }

            }
        }
        System.out.println("Сумма элементов массивов: "+ count);
    }
}
