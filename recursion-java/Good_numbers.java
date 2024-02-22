/* A number is called good if it's every digit (except the rightmost digit) is larger than the sum of digits on the right side of that digit.
Find all the good numbers in the range from 'a' to 'b' (both inclusive), such that none of them contains 'digit' as a digit. */
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static boolean isGood(int n,int digit,int sum)
    {
        if(n==0) return true;
        int last=n%10;

        if(last>sum && last!=digit)
        {
            sum+=last;
            return isGood(n/10, digit, sum);
        }
        else{
            return false;
        }
    }
    public static List< Integer > goodNumbers(int a, int b, int digit) {
        // Write your code here.
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=a;i<=b;i++)
        {
            if(i%10==digit) continue;
            if(isGood(i/10,digit,i%10)) res.add(i);
        }
        return res;
    }
}
