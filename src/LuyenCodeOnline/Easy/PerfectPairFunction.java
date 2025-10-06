package LuyenCodeOnline.Easy;

import java.util.Scanner;

public class PerfectPairFunction {

    public static int[] findPerfectPair(int[] a) {
        int n = a.length;

        if (n < 2) {
            return new int[0];
        }

        long maxSum = Long.MIN_VALUE;
        int bestStartElement = 0;
        int bestSecondElement = 0;

        for (int i = 0; i < n - 1; i++) {
            long currentSum = (long) a[i] + a[i + 1];

            if (currentSum >= maxSum) {
                maxSum = currentSum;
                bestSecondElement = a[i + 1];
                bestStartElement = a[i];
            }
        }

        long circularSum = (long) a[n - 1] + a[0];

        if (circularSum >= maxSum) {
            maxSum = circularSum;
            bestStartElement = a[n - 1];
            bestSecondElement = a[0];
        }

        return new int[]{bestStartElement, bestSecondElement};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        int[] result = findPerfectPair(a);
        if (result.length == 2) {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
