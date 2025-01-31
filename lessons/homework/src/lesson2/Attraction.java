package lesson2;

import java.time.LocalTime;

public class Attraction {
    private String name;
    private LocalTime timeStart;
    private LocalTime timeEnd;
    private float price;

    public Attraction(String name, LocalTime timeStart, LocalTime timeEnd, float price) {
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                ", price=" + price +
                '}';
    }
}
