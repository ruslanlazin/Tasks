package ua.pp.lazin.flowcontrol.task4;

/**
 * @author Ruslan Lazin
 */
public class TrianglePrinter {

    public static void printLeftTriangle(final int firstElement, final int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((j + firstElement) + " ");
            }
            System.out.println();
        }
    }

    public static void printLeftTriangle(final int length) {
        printLeftTriangle(0, length);
    }

    public static void printLeftTriangle() {
        printLeftTriangle(0, 5);
    }

    public static void printRightTriangle(final int firstElement, final int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j >= 0; j--) {
                if (i >= j) {
                    System.out.print((j + firstElement) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printRightTriangle(final int length) {
        printRightTriangle(1, length);
    }

    public static void printRightTriangle() {
        printRightTriangle(1, 5);
    }
}
