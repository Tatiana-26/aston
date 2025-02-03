package lesson3.figure;

public class TriangleServiceImpl implements FigureService<Triangle> {
    @Override
    public double countArea(Triangle figure) {
        double p = (figure.getFirstSideLength() + figure.getSecondSideLength() + figure.getThirdSideLength())/2;
        double inter = p * ((p - figure.getFirstSideLength()) * (p - figure.getSecondSideLength()) * (p - figure.getThirdSideLength()));
        double area = Math.sqrt(inter);
        return area;
    }
}
