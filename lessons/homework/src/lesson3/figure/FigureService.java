package lesson3.figure;

public interface FigureService<Figure> {

    public double countArea(Figure figure);

    default double countLength(Figure figure) {
        if (figure instanceof Rectangle rectangle) {
            return (rectangle.getFirstSideLength() + rectangle.getSecondSideLength()) * 2;
        } else if (figure instanceof Triangle triangle) {
            return triangle.getFirstSideLength() + triangle.getSecondSideLength() + triangle.getThirdSideLength();
        } else if (figure instanceof Circle circle) {
            return 2 * circle.getRadius() * Math.PI;
        } else {
            return 0;
        }
    }
}
