/* You are given an array 'A' of 'N' integers. You have to return true if there exists a subset of elements of 'A' that sums up to 'K'. Otherwise, return false.*/
import java.util.ArrayList;

public class Solution {
    public static boolean helper(int sum,int k,int[] a,int i){
        if(sum==k)
        return true;
        else if(sum>k||i>=a.length) return false;
        return helper(sum+a[i], k, a, 1+i)||helper(sum, k, a, i+1);
    }


    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
       return helper(0, k, a, 0)
    ;}
}
