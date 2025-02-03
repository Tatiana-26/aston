package lesson3.animals;

public class Plate {
    private static int plateCount;

    public static int addFood(int foodAddNumber) {
        plateCount = plateCount + foodAddNumber;
        return plateCount;
    }

    public static int eatFood(int foodAteNumber) {
        if (plateCount - foodAteNumber < 0) {
           throw new RuntimeException();
        }
        plateCount = plateCount - foodAteNumber;
        return plateCount ;
    }

    public static int getPlateCount() {
        return plateCount;
    }
}
