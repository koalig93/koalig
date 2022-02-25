package pingwit.hw_2.task_1;

public class RunnerDistanceCalculator {
    public static void main(String[] args) {
        int initialDistance = 10;
        int dailyIncPercentage = 10; // %
        int dayNumber = 7;
        double totalDistance = calculateTotalDistance(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("total distance: " + totalDistance + " km");
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
}
