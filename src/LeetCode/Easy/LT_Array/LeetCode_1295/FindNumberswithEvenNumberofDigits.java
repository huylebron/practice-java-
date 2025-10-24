package LeetCode.Easy.LT_Array.LeetCode_1295;

public class FindNumberswithEvenNumberofDigits {

    public int FindNumber ( int[] nums ) {
        int count = 0 ;

        for ( int num : nums ) {

            int digits = String.valueOf(num).length();
            if ( digits % 2 ==0 ) {
                count ++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};

        System.out.println(new FindNumberswithEvenNumberofDigits().FindNumber(nums));

    }
}