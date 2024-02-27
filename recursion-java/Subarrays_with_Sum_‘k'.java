/* You are given an array 'A' of size 'N' and an integer'K'’. You need to generate and return all subarrays of array ‘A’ whose sum = ‘K’.
Note: In the output, you will see the 2D array lexicographically sorted.*/

import java.util.*;

public class Solution {

    public static List<List<Integer>> subarraysWithSumK(int[] a, long k) {
        int sum=0,left=0;
        List<List<Integer>> result=new ArrayList<>();
        for(int right=0;right<a.length;right++)
        {
            sum+=a[right];
            while(sum>k)
            {
                sum-=a[left];
                left++;
            }
            if(sum==k)
            {
                List<Integer> cur=new ArrayList<>();
for(int i=left;i<=right;i++)
{
    cur.add(a[i]);

}
result.add(cur);
            }
        }
        return result;
    }
}
