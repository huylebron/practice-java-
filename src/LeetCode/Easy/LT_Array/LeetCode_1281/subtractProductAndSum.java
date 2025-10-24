package LeetCode.Easy.LT_Array.LeetCode_1281;

public class subtractProductAndSum {
    public static int subtractProductAndSumImp (int n ) {

        int product = 1 ;
        int sum  = 0;

        while ( n  >0 ) {

            int digit = n % 10 ;
            product*=  digit ;
            sum += digit ;

            n/= 10 ;
        }
        return product - sum ;
    }


    public static void main(String[] args) {

        subtractProductAndSum sol = new subtractProductAndSum();
        System.out.println(sol.subtractProductAndSumImp(234));



    }
}