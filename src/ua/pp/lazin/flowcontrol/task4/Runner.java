package ua.pp.lazin.flowcontrol.task4;

/**
 * @author Ruslan Lazin
 */
public class Runner {
    public static void main(String[] args) {
        TrianglePrinter.printLeftTriangle(0,5);
        TrianglePrinter.printLeftTriangle(5);
        TrianglePrinter.printLeftTriangle();

        TrianglePrinter.printRightTriangle(1,5);
        TrianglePrinter.printRightTriangle(5);
        TrianglePrinter.printRightTriangle();
    }
}
