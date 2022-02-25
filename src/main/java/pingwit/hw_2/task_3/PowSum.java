package pingwit.hw_2.task_3;

public class PowSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i <<= 1) {
            sum += i;
        }
        System.out.println("result: " + sum);

        // let's check the result
        // we know that 256 = 2^8, so 1 + 2 + ... + 2^8 = 2^9 - 1
        sum = (1 << 9) - 1;
        System.out.println("check: " + sum);
    }
}
