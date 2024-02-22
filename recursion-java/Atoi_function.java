

public class Solution {
    public static int helper(String s,int start,int res)
    {
        if(s.length()== start)
        return res;
        
if(s.charAt(start)-'0'>=0 && s.charAt(start)-'0'<=9)
{
    int digit=s.charAt(start)-'0';
     if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10 && digit>7))
     {
         return (s.charAt(0)=='-')?Integer.MIN_VALUE:Integer.MAX_VALUE;
     }
    res=res*10+digit;

    
}
else{
    return res;
}
return helper(s, start+1, res);
    }
    public static int createAtoi(String str) {
        String s=str.trim();
        int n=s.length();
        int sign=0,start=0;
        if(s.charAt(0)=='+')
        {
            sign=1;
            start=1;
        }
        else if(s.charAt(0)=='-')
        {
            sign=-1;
            start=1;

        }
        else{
            sign=1;
            start=0;
        }
        int res=0;
int ans=sign*helper(s, start, res);
return ans;
    }
}
