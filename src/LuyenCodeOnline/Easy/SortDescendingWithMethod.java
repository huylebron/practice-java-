package LuyenCodeOnline.Easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortDescendingWithMethod {

    public static  void sortAndPrintDescending ( Integer[] arr ) {

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder res = new StringBuilder();
        for( int i = 0 ; i <arr.length; i++)  {
            res.append(arr[i]);
            if( i < arr.length  - 1 ) {
                res.append(" ");

            }
        }

        System.out.println(res.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] A = new Integer[n];
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextInt()) {

                return;
            }
            A[i] = scanner.nextInt();
        }


        scanner.close();
        sortAndPrintDescending(A);


    }

}
