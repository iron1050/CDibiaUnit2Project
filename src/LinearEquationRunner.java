import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("  ____ _           _                                    \n" +
                " / ___| |__  _   _| | ____      ___   _ _ __ ___   __ _ \n" +
                "| |   | '_ \\| | | | |/ /\\ \\ /\\ / / | | | '_ ` _ \\ / _` |\n" +
                "| |___| | | | |_| |   <  \\ V  V /| |_| | | | | | | (_| |\n" +
                " \\____|_|_|_|\\__,_|_|\\_\\  \\_/\\_/  \\__,_|_| |_| |_|\\__,_|\n" +
                "|  _ \\(_) |__ (_) __ _                                  \n" +
                "| | | | | '_ \\| |/ _` |                                 \n" +
                "| |_| | | |_) | | (_| |                                 \n" +
                "|____/|_|_.__/|_|\\__,_|                                 ");
        // my friend Ibrahim Toureg gave me the idea to print my name like this
        System.out.println("----------------------------------------------------------");

        System.out.println("Welcome!");
        System.out.print("Enter a pair of coordinates: ");
        String coord1 = s.nextLine();
        System.out.print("Enter another pair of coordinates: ");
        String coord2 = s.nextLine();
        int x1 = Integer.parseInt(coord1, 1, coord1.indexOf(","), 10);
        int y1 = Integer.parseInt(coord1, coord1.indexOf(",") + 2, coord1.indexOf(")"), 10);
        int x2 = Integer.parseInt(coord2, 1, coord2.indexOf(","), 10);
        int y2 = Integer.parseInt(coord2, coord2.indexOf(",") + 2, coord2.indexOf(")"), 10);
        if (x2 == x1) {
            System.out.println("This equation is a vertical line, with an equation of x = " + x1);
        }else {
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println("----- Line info -----");
            System.out.println(equation.lineInfo());
            System.out.println();
            System.out.print("Type an x coordinate to find the value of: ");
            double testX = s.nextDouble();
            System.out.println("Coordinate for x: " + equation.coordinateForX(testX));


        }
    }
}
