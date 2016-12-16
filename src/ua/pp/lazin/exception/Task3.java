package ua.pp.lazin.exception;

/**
 * @author Ruslan Lazin
 */
public class Task3 {

    public static void main(String[] args) {

        try {
            produceArithmeticException(0);

        } catch (ArithmeticException e) {
            System.err.println(e);
        } finally {
            System.out.println("Finally block invoke with Exception");
        }

        try {
            produceArithmeticException(5);

        } catch (ArithmeticException e) {
            System.err.println(e);
        } finally {
            System.out.println("Finally block invoke without Exception");
        }
    }

    private static void produceArithmeticException(int divider) {
        int a = 5 / divider;
    }

}
