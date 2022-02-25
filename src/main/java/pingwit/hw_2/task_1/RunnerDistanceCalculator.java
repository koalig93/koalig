package pingwit.hw_2.task_1;

import java.math.BigDecimal;

public class RunnerDistanceCalculator {
    public static void main(String[] args) {
        int initialDistance = 10;
        int dailyIncPercentage = 10; // % - есть подозрение, что слово Percentage обозначает %, комментарий не нужен
        int dayNumber = 7;
        double totalDistance = calculateTotalDistance(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("total distance: " + totalDistance + " km");

        totalDistance = calculateTotalDistanceByFormula(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("check total distance: " + totalDistance + " km");
    }

    // Раз ты знаешь про существование BigDecimal, то и в этом методе резонно его использовать
    // было бы интересно сравнить что быстрее: цикл или pow
    private static double calculateTotalDistance(double initialDistance, int dailyIncPercentage, int dayNumber) {
        double currentDayDistance = initialDistance;
        double totalDistance = initialDistance;
        double dailyInc = 0.01 * dailyIncPercentage; // строка выглядит непонятной -> 10/100 более привычная форма. dailyInc - dailyIncCoefficient я бы предложил
        for (int i = 1; i < dayNumber; ++i) {
            currentDayDistance += currentDayDistance * dailyInc;
            totalDistance += currentDayDistance;
        }
        return totalDistance;
    }

    // very slow - если считаешь это решение плохим и тем более медленным, то стоит от него избавиться
    private static double calculateTotalDistanceByFormula(double initialDistance, int dailyIncPercentage, int dayNumber) {
        double dailyInc = 0.01 * dailyIncPercentage;
        double pow = BigDecimal.valueOf(1 + dailyInc).pow(dayNumber).doubleValue();
        return initialDistance * (pow - 1) / dailyInc;
    }
}
