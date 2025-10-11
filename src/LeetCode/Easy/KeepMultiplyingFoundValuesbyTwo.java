package LeetCode.Easy;
//2154. Keep Multiplying Found Values by Two

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class KeepMultiplyingFoundValuesbyTwo {
public int FindFinalValue ( int[] nums , int original) {
    new ArrayList<String>();

    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
        numSet.add(num);

    }
    while (numSet.contains(original)) {

        original *= 2 ;

    }
    return original;



}

    public static void main(String[] args) {
        KeepMultiplyingFoundValuesbyTwo sol = new KeepMultiplyingFoundValuesbyTwo();

        int[] test = { 5 , 3 ,6 ,1 ,12 } ;
        int testOr = 3 ;
        int finalVal = sol.FindFinalValue(test, testOr) ;
        for (String s : Arrays.asList("input nums : " + Arrays.toString(test), "Input original: " + testOr, "out : " + finalVal)) {
            System.out.println(s);
        }
    }


}
