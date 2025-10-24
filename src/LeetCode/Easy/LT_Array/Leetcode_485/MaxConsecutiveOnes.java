package LeetCode.Easy.LT_Array.Leetcode_485;

public class MaxConsecutiveOnes {

    public static int  MaxConsecutiveOnesImp(int[] nums) {



        int best = 0;
        int cur = 0;

        for (int x : nums) {
            if (x == 1) {
                cur++;
                if (cur > best) best = cur;
            } else {
                cur = 0;
            }
        }

        return best;
    }

    public static void main(String[] args) {
       int[] nums = new int[]{1,1,0,1,1,1};
       System.out.println(MaxConsecutiveOnesImp(nums));


    }





}