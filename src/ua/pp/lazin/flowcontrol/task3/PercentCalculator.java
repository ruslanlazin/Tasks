package ua.pp.lazin.flowcontrol.task3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author Ruslan Lazin
 */
public class PercentCalculator {
    public static int calculateYearsToReachGoal(final BigDecimal initialAmount,
                                                final BigDecimal percent,
                                                final BigDecimal goal) {
        int count = 0;
        BigDecimal calculatedAmount = initialAmount;
        MathContext coefficientPrecision = new MathContext(10, RoundingMode.HALF_UP);
        BigDecimal coefficient = percent.divide(new BigDecimal(100), coefficientPrecision)
                                        .add(BigDecimal.ONE);
        System.out.println(coefficient);
        while (calculatedAmount.compareTo(goal) < 0) {
            MathContext moneyPrecision = new MathContext(2, RoundingMode.HALF_DOWN);
            calculatedAmount = calculatedAmount.multiply(coefficient, moneyPrecision);
            count++;
        }
        return count;
    }
}
