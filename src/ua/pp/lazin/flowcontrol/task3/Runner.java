package ua.pp.lazin.flowcontrol.task3;

import java.math.BigDecimal;

/**
 * @author Ruslan Lazin
 */
public class Runner {
    public static void main(String[] args) {
        BigDecimal init = new BigDecimal(100);
        BigDecimal percent = new BigDecimal("10.2");
        BigDecimal goal = new BigDecimal(1000);

        int yearsToReachGoal = PercentCalculator.calculateYearsToReachGoal(init, percent, goal);
        System.out.println("you can reach goal in " + yearsToReachGoal + " years");
    }
}
