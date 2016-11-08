/**
 * Created by hlieu on 11/7/16.
 */
public class BitwiseOrOperator {

    public static void illegal() {
        try {
            int xx = 0;

            if( (xx != 0) & (1/xx > xx) ) {
                System.out.println("this will never be reached because 1/xx is an exception");
            }
        } catch (Exception e) {
            System.out.println("Exception thrown " + e.getClass());
        }
    }

    public static void legal() {
        int x = 0;

        //Object y = null;

        if( (x != 0) && (1/x > x) ) {
            System.out.println("this will never be reached because 1/xx is an exception");
        } else {
            System.out.println("since (x != 0) is false, the 2nd operand is never executed.");
        }

        if( (x != 0) & (++x != 1) ) {
            System.out.println("This never prints.");
        }
        System.out.println("x is now incremented because the 2nd operand executes, x=" + x);

    }

    public static void common() {
        Object x = null;

        if( x != null && x.getClass() != null ) {
            System.out.println("This never prints");
        } else {
            System.out.println("Since x != null is false, the 2nd operand never executes");
        }
    }

    public static void bittwiddle() {
        int x = 0;
        int y = 1;
        System.out.println("x & y = " + (x & y));

        x = 4;
        y = 3;
        System.out.println("x & y = " + (x & y));

        x = 5;
        y = 2;
        System.out.println("x & y = " + (x & y));

    }

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // & causes both operand to be evaluated
        System.out.println("x & y " + (x & y));
        System.out.println("y & x " + (y & x));
        illegal();
        legal();
        common();
        bittwiddle();
    }
}
