import javax.sound.sampled.Line;
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a pair of coordinates: ");
        String coord1 = s.nextLine();
        System.out.print("Enter another pair of coordinates: ");
        String coord2 = s.nextLine();
        //double rounded = Math.round(1.896 * 100 ) / 100.0;        IMPORTANT FOR ROUNDING LTR
        //System.out.print(rounded);
        int x1 = Integer.parseInt(coord1, 1, coord1.indexOf(","), 10);
        int y1 = Integer.parseInt(coord1, coord1.indexOf(",") + 2, coord1.indexOf(")"), 10);
        int x2 = Integer.parseInt(coord2, 1, coord2.indexOf(","), 10);
        int y2 = Integer.parseInt(coord2, coord2.indexOf(",") + 2, coord2.indexOf(")"), 10);
        LinearEquation test = new LinearEquation(x1, y1, x2, y2);
        System.out.println(test.slope());
        //System.out.println(test.equation());



    }
}
