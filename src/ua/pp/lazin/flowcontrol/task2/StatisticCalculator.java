package ua.pp.lazin.flowcontrol.task2;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Ruslan Lazin
 */
public class StatisticCalculator<T extends Number> {

    public Statistic getStatistic(List<T> numbers) {
        Statistic<T> statistic = new Statistic<>();
        Double sum = 0.0;
        T min = numbers.get(0);
        T max = numbers.get(0);
        for (T number : numbers) {
            sum += number.doubleValue();
            if (min.doubleValue() > number.doubleValue()) {
                min = number;
            }
            if (max.doubleValue() < number.doubleValue()) {
                max = number;
            }
        }
        statistic.setMaxValue(max);
        statistic.setMinValue(min);
        statistic.setAvgValue(sum / numbers.size());
        statistic.setSize(numbers.size());
        return statistic;
    }
}
