import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a pair of coordinates: ");
        String coord1 = s.next();
        /*System.out.print("Enter another pair of coordinates: ");
        String coord2 = s.next();
        double rounded = Math.round(1.896 * 100 ) / 100.0;
        System.out.print(rounded);*/

        int x1 = Integer.parseInt(coord1, 1, coord1.indexOf(","), 10);
        System.out.print(x1);
        /*int y1 = Integer.parseInt(coord1, coord1.indexOf(",") + 2, coord1.indexOf(")"), 10);
        System.out.print("\n" + y1);*/
        System.out.println(coord1);
        System.out.print("\n" + coord1.indexOf(")"));
    }
}
