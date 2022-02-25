package pingwit.hw_2.task_1;

import java.math.BigDecimal;

public class RunnerDistanceCalculator {
    public static void main(String[] args) {
        int initialDistance = 10;
        int dailyIncPercentage = 10; // %
        int dayNumber = 7;
        double totalDistance = calculateTotalDistance(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("total distance: " + totalDistance + " km");

        totalDistance = calculateTotalDistanceByFormula(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("check total distance: " + totalDistance + " km");
    }

    private static double calculateTotalDistance(double initialDistance, int dailyIncPercentage, int dayNumber) {
        double currentDayDistance = initialDistance;
        double totalDistance = initialDistance;
        double dailyInc = 0.01 * dailyIncPercentage;
        for (int i = 1; i < dayNumber; ++i) {
            currentDayDistance += currentDayDistance * dailyInc;
            totalDistance += currentDayDistance;
        }
        return totalDistance;
    }

    // very slow
    private static double calculateTotalDistanceByFormula(double initialDistance, int dailyIncPercentage, int dayNumber) {
        double dailyInc = 0.01 * dailyIncPercentage;
        double pow = BigDecimal.valueOf(1 + dailyInc).pow(dayNumber).doubleValue();
        return initialDistance * (pow - 1) / dailyInc;
    }
}
