package lesson3.figure;

public class Rectangle extends Figure{
    private double firstSideLength;
    private double secondSideLength;

    public Rectangle(String fillColor, String borderColor, double firstSideLength, double secondSideLength) {
        super(fillColor, borderColor);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public void setFirstSideLength(double firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(double secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                "} " + super.toString();
    }
}
