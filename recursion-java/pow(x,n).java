/*You are given two numbers ’x’(it’s a float), and ’n’(it’s a integer).
Your task is to calculate ‘x’ raised to power ‘n’, and return it.
The expected time complexity is ’O(logn)’, and the expected space complexity is ’O(1)’, where ‘n’ is the power to which the number should be raised.*/




public class Solution {
    public static double pow(double x,int n )
    {
        if(n==0) return 1;
        if(n>0)
        {
         if(n==1) return x;
          return x*pow(x, n-1);
    }
    else{
        if(n==0) return 1/x;
        return (1/x)*pow(x, n+1);
    }
    }
    public static double myPow(double x, int n) {
        // Write Your Code Here
        return pow(x, n);
    }
}
