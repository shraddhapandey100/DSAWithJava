//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch: x.toCharArray()){
            //If it's an opening bracket, push to stack.
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty())return false;
                char last = stack.pop();
                if(!isMatch(last, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isMatch(char open, char close){
        return (open == '(' && close == ')') || 
                (open == '{' && close == '}')||
                (open == '[' && close == ']');
    }
}
