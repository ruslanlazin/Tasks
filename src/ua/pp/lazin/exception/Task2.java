package ua.pp.lazin.exception;

/**
 * @author Ruslan Lazin
 */
public class Task2 {

    public static void main(String[] args) {

        try {
            produceArithmeticException();

        } catch (ArithmeticException e) {
            System.err.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("ArithmeticException has been caught in catch block");
        }
    }

    private static void produceArithmeticException() {
        int a = 5 / 0;
    }

}
