package LuyenCodeOnline.Easy;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortPrimes {


    public static boolean IsPrime (int n) {
        if (n <= 1) { // Dùng n <= 1 để loại trừ 1, 0, số âm
            return false;
        }

        // Kiểm tra đến căn bậc hai của n
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if (n % i == 0) {
                return false; // Không phải số nguyên tố
            }
        }
        return true; // Là số nguyên tố
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // BƯỚC 1: Đọc số lượng phần tử N
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            // Xử lý trường hợp không đọc được N (nếu cần)
            return;
        }

        // BƯỚC 2: Khởi tạo TreeSet để tự động loại bỏ trùng lặp và sắp xếp tăng dần
        Set<Integer> primeNumber = new TreeSet<>();

        // BƯỚC 3: Đọc N phần tử và lọc số nguyên tố
        for (int i = 0 ; i < n ; i++) {
            // Đảm bảo có đủ input để đọc
            if (scanner.hasNextInt()) {
                int element = scanner.nextInt();

                if (IsPrime(element)){
                    primeNumber.add(element);
                }
            }
        }

        scanner.close();

        // BƯỚC 4: In kết quả theo định dạng yêu cầu
        StringBuilder res = new StringBuilder() ;

        for (int prime : primeNumber){
            res.append(prime).append(" ") ;
        }

        // trim() loại bỏ dấu cách thừa cuối cùng
        System.out.println(res.toString().trim());
    }
}