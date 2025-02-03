package lesson3.figure;

public class CircleServiceImpl implements FigureService<Circle> {
    @Override
    public double countArea(Circle figure) {
        return Math.PI *  Math.pow(figure.getRadius(), 2);
    }
}
