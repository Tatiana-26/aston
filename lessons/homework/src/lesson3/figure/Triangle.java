package lesson3.figure;

public class Triangle extends Figure{
    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;


    public Triangle(String fillColor, String borderColor, double firstSideLength, double secondSideLength, double thirdSideLength) {
        super(fillColor, borderColor);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
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

    public double getThirdSideLength() {
        return thirdSideLength;
    }

    public void setThirdSideLength(double thirdSideLength) {
        this.thirdSideLength = thirdSideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                ", thirdSideLength=" + thirdSideLength +
                "} " + super.toString();
    }
}
