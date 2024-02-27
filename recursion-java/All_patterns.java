/* You are given two strings 'A' and 'B' of length 'N' and 'M' respectively.
Return the string that has more distinct subsequences, if both strings have the same number of distinct subsequences, then return 'A'.*/

import java.util.ArrayList;

public class Solution {
public static void subset(String s,int i,ArrayList<String> res,String cur)
{
    if(s.length()==i)
    {
        if(!res.contains(cur))
        {
            res.add(cur);
        }
        return;

    }
    subset(s, i+1, res, cur+s.charAt(i));
    subset(s, i+1, res, cur);
}
    public static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
        ArrayList<String> Ares=new ArrayList<>();
                ArrayList<String> Bres=new ArrayList<>();
                subset(a, 0, Ares, "");
                subset(b, 0, Bres, "");
if(Ares.size()>Bres.size()) return a;
return b;
    }
}
