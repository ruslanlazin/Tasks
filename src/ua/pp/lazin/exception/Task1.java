package ua.pp.lazin.exception;

/**
 * @author Ruslan Lazin
 */
public class Task1 {

    public static void main(String[] args) {
        Task1 Task1 = null;

        try {

            Task1.someMethodToProduceNulPointerException();

        } catch (NullPointerException e) {
            System.err.println("Unchecked Exception has been caught " + e);
            e.printStackTrace();
        }
    }

    private void someMethodToProduceNulPointerException() {
        // some code
    }

}
