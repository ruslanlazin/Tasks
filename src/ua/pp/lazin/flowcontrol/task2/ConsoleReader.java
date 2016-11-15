package ua.pp.lazin.flowcontrol.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    public static List<Double> readNumbers() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();
        String inputLine = "";

        System.out.println("Input number and press Enter, or input 'c' to calculate");
        while (!"c".equalsIgnoreCase(inputLine)) {
            if (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    numbers.add(scanner.nextDouble());
                } else inputLine = scanner.nextLine();
            }
        }
        return numbers;
    }
}