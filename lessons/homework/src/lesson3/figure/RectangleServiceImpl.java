package lesson3.figure;

public class RectangleServiceImpl implements FigureService<Rectangle> {
    @Override
    public double countArea(Rectangle figure) {
        return figure.getFirstSideLength() * figure.getSecondSideLength();
    }

}
