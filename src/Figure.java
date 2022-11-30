public class Figure
{
    private Square square;
    private Circle circle;

    public Figure(float squareSide)
    {
        square = new Square(squareSide);
        circle = new Circle(squareSide / 2);
    }

    public float getAreaOfPicture1()
    {
        return (square.getArea() - circle.getArea()) / 2;
    }

    public float getAreaOfPicture2()
    {
        return circle.getArea() + (square.getArea() - circle.getArea()) / 2;
    }

    public float getAreaOfPicture3()
    {
        return square.getArea() / 4 + (square.getArea() - circle.getArea()) / 4;
    }
}
