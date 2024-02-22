/* You have been given an integer 'N'. Your task is to generate and return all binary strings of length 'N' such that there are no consecutive 1's in the string.
A binary string is that string which contains only ‘0’ and ‘1’.*/
import java.util.List;
import java.util.*;
public class Solution {
    public static void Binarystring(int n,int last,String s,List<String> res)
    {
if(n==0)
{ 
    res.add(s);
return;
}
Binarystring(n-1, 0, s+0, res);
if(last==0)
{
    Binarystring(n-1, 1, s+1, res);
}
    }
    public static List<String> generateString(int N) {
        // Write your code here.
        List<String> res=new ArrayList<String>();
        Binarystring(N, 0, "", res);
        return res;
    }
}
