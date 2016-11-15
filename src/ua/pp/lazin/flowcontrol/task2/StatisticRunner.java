package ua.pp.lazin.flowcontrol.task2;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * @author Ruslan Lazin
 */
public class StatisticRunner {
    public static void main(String[] args) throws IOException {

        List<Double> numbers = ConsoleReader.readNumbers();
        if (numbers.isEmpty()) {
            System.out.println("No numbers - no statistic");
        } else {
            StatisticCalculator<Double> calculator = new StatisticCalculator<>();
            Statistic statistic = calculator.getStatistic(numbers);

            System.out.println("Total numbers: " + statistic.getSize());
            System.out.println("Max number: " + statistic.getMaxValue());
            System.out.println("Min number: " + statistic.getMinValue());
            System.out.println("Avg value: " + statistic.getAvgValue());
        }
    }
}
