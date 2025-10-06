package LeetCode.Easy;
//2154. Keep Multiplying Found Values by Two

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Giữ nhân đôi giá trị ban đầu nếu nó được tìm thấy trong mảng nums.
 *
 * @param nums Mảng các số nguyên.
 * @param original Giá trị ban đầu cần tìm kiếm và nhân đôi.
 * @return Giá trị cuối cùng của original.
 */

public class KeepMultiplyingFoundValuesbyTwo {
public int FindFinalValue ( int[] nums , int original){

    Set<Integer> numSet = new HashSet<>() ;
    for ( int num : nums) {
        numSet.add(num);

    }
    while (numSet.contains(original)){
        original *= 2 ;

    }

    return original;
   }

    public static void main(String[] args) {
        KeepMultiplyingFoundValuesbyTwo sol = new KeepMultiplyingFoundValuesbyTwo();

        int[] test = { 5 , 3 ,6 ,1 ,12 } ;
        int testOr = 3 ;
        int finalVal = sol.FindFinalValue(test, testOr) ;
        System.out.println("input nums : " + Arrays.toString(test));
        System.out.println("Input original: " + testOr);
        System.out.println("out : " + finalVal);
    }


}
