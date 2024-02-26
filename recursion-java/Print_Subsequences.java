/* Given a string 'S' of length 'N', return all the subsequences of the given string
A subsequence is a sequence that can be derived from the given sequence by deleting zero or more elements without changing the order of the remaining elements.*/

import java.util.*;
public class Solution {
    public static void subsequence(String s,String f,ArrayList<String> res,int i)
    {
if(i==s.length())
{
    res.add(f);
    return;
}
subsequence(s, f+s.charAt(i), res, i+1);
subsequence(s, f, res, i+1);//pop
    }
    public static List<String> generateSubsequences(String s) {
        // Write your code here
        ArrayList<String> res=new ArrayList<>();
subsequence(s, "", res, 0);
return res;
    }
}
