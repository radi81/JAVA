import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] coordinatesPointX = new int[]{console.nextInt(), console.nextInt()};
        int[] coordinatesPointY = new int[]{console.nextInt(), console.nextInt()};
        int[] coordinatesPointZ = new int[]{console.nextInt(), console.nextInt()};

        double sideXY = Math.sqrt(Math.pow((coordinatesPointX[0] - coordinatesPointY[0]), 2) +
                Math.pow((coordinatesPointX[1] - coordinatesPointY[1]), 2));
        double sideXZ = Math.sqrt(Math.pow((coordinatesPointX[0] - coordinatesPointZ[0]), 2) +
                Math.pow((coordinatesPointX[1] - coordinatesPointZ[1]), 2));
        double sideZY = Math.sqrt(Math.pow((coordinatesPointZ[0] - coordinatesPointY[0]), 2) +
                Math.pow((coordinatesPointZ[1] - coordinatesPointY[1]), 2));

        boolean isValidTriangle = sideXY + sideXZ > sideZY && sideXY + sideZY > sideXZ && sideZY + sideXZ > sideXY;

        // Heron's formula for the area of a triangle
        double semiPerimeter = (sideXY + sideXZ + sideZY) / 2;
        double triangleArea = 0d;

        if (isValidTriangle) {
            triangleArea = Math.sqrt(
                    semiPerimeter * (semiPerimeter - sideXY) * (semiPerimeter - sideXZ) * (semiPerimeter - sideZY));
        }

        System.out.printf("%d\n", Math.round(triangleArea));
    }
}
