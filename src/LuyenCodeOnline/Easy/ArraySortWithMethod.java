package LuyenCodeOnline.Easy;

import javax.naming.NameNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortWithMethod {
    
    public static void sortPatialArr( int[] arr) {
        int n = arr.length; 
        if (n >= 3 ){
            Arrays.sort(arr, 1 , n - 1 );
            
        }
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out) ;

        int n = scanner.nextInt();

        int[] A = new int[n];

        // 2. Đọc n phần tử của mảng A
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        sortPatialArr(A);
        for (int i = 0; i < n; i++) {
            printWriter.print(A[i]);
            if (i < n - 1) {
                printWriter.print(" "); // Thêm dấu cách
            }
        }
        printWriter.println(); // Xuống dòng cuối
        
        
        scanner.close();;
        printWriter.flush();
        
        
    }
}
