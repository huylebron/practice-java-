package LuyenCodeOnline.Easy;

import java.text.Format;
import java.util.Scanner;

public class BetweenMaxMin {
    public static long MaxvsMin(int[] a) {

        long minVal = a[0];
        long maxVal = a[0];
        for (int i = 1; i < a.length; i++) {
            int v = a[i];
            if (v < minVal) {
                minVal = v;
            }
            if (v > maxVal) {
                maxVal = v;
            }

        }
        return maxVal - minVal;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();


        }


        scanner.close();
        long maxdiff = MaxvsMin(a);
        System.out.println(maxdiff);
    }


}
