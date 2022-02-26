package pingwit.hw_2.task_5;

public class DistanceTable {
    private static final double CM_PER_INCH = 2.54; // отделяй константы абзацем
    public static void main(String[] args) {
        for (int inchDist = 1; inchDist <= 20; ++inchDist) { // 20 - магических чисел не должно быть, выноси в переменную
            System.out.println(inchDist + " inch = " + inchDist * CM_PER_INCH + " cm");
        }
    }
}
