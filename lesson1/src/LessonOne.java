public class LessonOne {

    protected static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    protected static void checkSumSign() {
        int a = 4;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }


    protected static void printColor() {

        int value = 43;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    protected static void compareNumbers() {
        int a = 67;
        int b = 41;
        if (a >= b) {
            System.out.println("а>=b");
        } else {
            System.out.println("a<b");
        }


    }

    protected static boolean exerciseFive() {
        int a = 6;
        int b = 8;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    protected static void exerciseSix(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    protected static boolean exerciseSeven(int b) {
        if (b >= 0) {
            return false;
        } else {
            return true;
        }
    }

    protected static void exerciseEight() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Добрый вечер!");
        }

    }

    protected static boolean exerciseNine(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return true;
        }
        return false;
    }

    protected static void exerciseTen() {
        int[] row = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                row[i] = 1;
            } else {
                row[i] = 0;
            }
        }
    }

    protected static void exerciseEleven() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i;
        }
    }

    protected static void exerciseTwelve() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    protected static void exerciseThirteen() {
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected static void exerciseFourteen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }

    }

}


