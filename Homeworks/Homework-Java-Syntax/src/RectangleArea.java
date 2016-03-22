import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstRectangleSide = console.nextInt();
        int secondRectangleSide = console.nextInt();

        int rectangleArea = firstRectangleSide * secondRectangleSide;
        System.out.println(rectangleArea);
    }
}
