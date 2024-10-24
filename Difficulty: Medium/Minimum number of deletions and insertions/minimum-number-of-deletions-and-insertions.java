//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int m = str1.length();
	    int n = str2.length();
	    //Step 1: Compute the length of LCS using dynamic programming.
	    int[][] dp = new int[m+1][n+1];
	    for(int i=1; i<=m; i++){
	        for(int j=1; j<=n; j++){
	            if(str1.charAt(i-1) == str2.charAt(j-1)){
	                dp[i][j] = 1 + dp[i-1][j-1];
	            }else{
	                dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
	            }
	        }
	    }
	    int lcsLength = dp[m][n];
	    // Step 2: Calculate the number of deletions and insertions.
	    int deletions = m - lcsLength;
	    int insertions = n -lcsLength;
	    //Total operations (deletions + insertions)
	    return deletions + insertions;
	} 
}