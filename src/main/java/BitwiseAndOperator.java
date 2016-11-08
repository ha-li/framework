/**
 * Created by hlieu on 11/7/16.
 */
public class BitwiseAndOperator {


    public static void bittwiddle() {
        int x = 0;
        int y = 7;
        System.out.println("x | y =" + (x | y));

        x = 6;
        y = 1;
        System.out.println("x | y =" + (x | y));

        x = 2;
        y = 5;
        System.out.println("x | y =" + (x | y));
    }

    public static void illegal() {
        int x = 0;
        try {
            if ((x != 0) | (1/x) != 1) {
                System.out.println("this never executes");
            }
        } catch (Exception e) {
            System.out.println("Exception thrown is " + e.getClass());
        }
    }

    public static void legal() {
        int x = 0;
        if ((x != 0) | (1/++x) != 1) {
            System.out.println("this never executes");
        } else {
          System.out.println("else gets printed in legal");
        }
    }

    public static void legal2() {
        int x = 0;
        if ((x != 0) | (1/++x) == 1) {
            if( (1/x == 1) ) {
                System.out.println("this is true because 1/++x == 1");
            }

            if(--x != 0){
                System.out.println("x != 0");
            }
        } else {
            System.out.println("else gets printed in legal");
        }
    }


    public static void main(String[] args) {
        illegal();
        legal();
        legal2();
        bittwiddle();

    }
}
