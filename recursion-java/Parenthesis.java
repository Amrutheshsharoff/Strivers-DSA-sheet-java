/*You are given an integer 'N', your task is to generate all combinations of well-formed parenthesis having ‘N’ pairs.
A parenthesis is called well-formed if it is balanced i.e. each left parenthesis has a matching right parenthesis and the matched pairs are well nested. */
import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        ArrayList<String> result=new ArrayList<>();
        int open=n;
        int close=n;
        helper("", open, close, result, n);
    return result;
    } 
    public static void helper(String cur,int open,int close,ArrayList<String> res,int n)
    {
        if(cur.length()==2*n)
{res.add(cur);
return;
    }
 if(open>0)
 {
     helper(cur+'(', open-1, close, res, n);
 }
 if(close>open)
 {
     helper(cur+')', open, close-1, res, n);
 }
    }
}
