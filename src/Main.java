import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float side = readSquareSide();

        Figure figure = new Figure(side);

        printArea("1", figure.getAreaOfPicture1());
        printArea("2", figure.getAreaOfPicture2());
        printArea("3", figure.getAreaOfPicture3());
    }

    private static float readSquareSide()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину стороны квадрата:");
        return scanner.nextFloat();
    }

    private static void printArea(String pictureName, float area)
    {
        System.out.printf("Площадь фигуры на рис. %s: %.3f\n", pictureName, area);
    }
}