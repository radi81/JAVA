import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dimension = input.nextInt();
        char c = 'a';

        for (int count = 0; count < dimension; count++) {
            c = 'a';
            for (int i = 0; i <= count; i++) {
                System.out.printf("%c ", c);
                c++;
            }

            System.out.println();
        }

        for (int count =  dimension - 2; count >= 0; count--) {
            c = 'a';
            for (int i = 0; i <= count; i++) {
                System.out.printf("%c ", c);
                c++;
            }

            System.out.println();
        }
    }
}
