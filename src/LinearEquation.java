public class LinearEquation {


    /* Instance Variables */
     int x1;
     int y1;
     int x2;
     int y2;


    /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated) */
public LinearEquation(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;

}


/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(rise(),2) + Math.pow(run(),2)));


    }

    public double rise() {
        return y2-y1;
    }

    public double run() {
        return x2-x1;
    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        return y1 - slope() * x1;
    }


    // positiveOrNegative is a method I added in order to format the numbers at strings, to make it easier when I write the equation
    public String positiveOrNegative(double number) {
        if (number > 0) {
            return "+ " + number;
        }
        if (number == 0) {
            return "";
        }
        if (number < 0) {
            return "- " + number*-1;
        } else {
            return "";
        }
    }
    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {

        //return (double) rise/run;
        return roundedToHundredth((double) rise() / run());
    }


    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".

        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7

        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)

        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!


        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0 	- 2.35	      + 12.5		- 8.0		+ 17.19

        Here are non-examples of "printable" y-intercepts:
           - -1.0 	+ -2.35	- -12.5	+ -8.0	     - -17.19	+ 0	- 0

        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */

    /* Here I used if and else statements to account for all possibilities when making the equation */
    public String equation() {
        String equationString = "";
        double rise = rise();
        double run = run();
        String slope = String.valueOf(slope());
        if (slope.equals("1.0") == true) {
            slope = "";
        }
        if (slope.equals("-1.0") == true)
            slope = "-";
        if (slope.equals("0.0")) {
            equationString = positiveOrNegative(yIntercept());
        }
        if ((rise() % run()) == 0) {
            if (slope() == 1) {
                equationString = ("x " + positiveOrNegative(yIntercept()));
            }
            if (slope() == -1.0) {
                equationString = ("-x " + positiveOrNegative(yIntercept()));
            }
            if (slope() == 0) {
                equationString = "" + yIntercept();
            }
            else {
                equationString = slope + "x " + positiveOrNegative(yIntercept());
            }
        } else if (rise % run != 0) {
            if (rise < 0 && run < 0) {
                run *= -1;
                rise *= -1;
                equationString = rise + "/" + (int) run + "x " + positiveOrNegative(yIntercept());
            }
            if (run > 0 && rise > 0) {
                equationString= (int) rise + "/" + (int) run + "x " + positiveOrNegative(yIntercept());
            }
            if (rise < 0 && run > 0) {
                equationString= (int) rise + "/" + (int) run + "x " + positiveOrNegative(yIntercept());
            }
            if (rise > 0 && run < 0) {
                rise *= -1;
                run *= -1;
                equationString= (int) rise + "/" + (int) run + "x " + positiveOrNegative(yIntercept());
            }

        }

        return "y = " + equationString;
    }



    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {
        return "(" + xValue + ", " + roundedToHundredth (xValue *slope() + yIntercept()) + ")";
    }


    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth

        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100 ) / 100.0;
    }


    /* Returns a string that includes all information about the linear equation, each on
       separate lines:
         - The original points: (x1, y1) and (x2, y2)
         - The equation of the line in y = mx + b format (using equation() method)
         - The slope of the line, as a decimal (using slope() method)
         - The y-intercept of the line (using yIntercept() method)
         - The distance between the two points (using distance() method)

      This method should call all other appropriate methods to get the info it needs:
      equation(), slope(), yIntercept(), distance().

      */
    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\nThe equation of the line between these points is: " + equation() + "\nThe slope of this line is: " + slope() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between these two points is: " + distance();

    }
}