package pingwit.hw_2.task_1;

import java.math.BigDecimal;

public class RunnerDistanceCalculator {
    public static void main(String[] args) {
        int initialDistance = 10;
        int dailyIncPercentage = 10; // % - есть подозрение, что слово Percentage обозначает %, комментарий не нужен -> ок
        int dayNumber = 7;
        double totalDistance = calculateTotalDistance(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("total distance: " + totalDistance + " km");

        totalDistance = calculateTotalDistanceByFormula(initialDistance, dailyIncPercentage, dayNumber);
        System.out.println("check total distance: " + totalDistance + " km");
    }

    // Раз ты знаешь про существование BigDecimal, то и в этом методе резонно его использовать
    // было бы интересно сравнить что быстрее: цикл или pow
    //
    // BigDecimal значительно замедляет производительность. В данной задаче я не видел смысла его использовать,
    // т.к. потеря точности для double крайне мала и того не стоит. Pow имеет значительно большую погрешность (на порядки),
    // чем операции умножения и сложения, и поэтому я решил использовать BigDecimal. И вообще я тут не пытался
    // показать преимущества в производительности (в данном случае рассчет по формуле заведомо быстрее).
    // Вторым методом я хотел лишь показать альтернативный вариант, заодно для проверки ответа
    // (если два разных подхода дают один результат, то выше вероятность того, что они верны)
    //
    // Да, для double я проверял, и быстрее работает pow. Думаю, что для BigDecimal скорость pow по сравнению с циклом будет выглядеть еще значительнее,
    // поскольку в BigDecimal.pow мы возводим в степень int.
    private static double calculateTotalDistance(double initialDistance, int dailyIncPercentage, int dayNumber) {
        double currentDayDistance = initialDistance;
        double totalDistance = initialDistance;
        double dailyIncCoeff = dailyIncPercentage / 100d; // строка выглядит непонятной -> 10/100 более привычная форма. dailyIncCoeff - dailyIncCoefficient я бы предложил -> так норм?
        for (int i = 1; i < dayNumber; ++i) {
            currentDayDistance += currentDayDistance * dailyIncCoeff;
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
