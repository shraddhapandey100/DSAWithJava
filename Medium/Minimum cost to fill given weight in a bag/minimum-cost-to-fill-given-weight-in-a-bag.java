//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int w;
            w = Integer.parseInt(br.readLine());

            int[] cost = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.minimumCost(n, w, cost);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int minimumCost(int n, int w, int[] cost) {
        int dp[] = new int[w+1], max = Integer.MAX_VALUE;
        Arrays.fill(dp, max);
        dp[0] =0;
        // pick ith element 
        for(int i=0; i<n; i++){
            //ith element weight is (i+1) so start from that.
            for(int j = i+1; j<=w; j++){
                dp[j] = Math.min(dp[j], cost[i] + dp[j - (i+1)]);
            }
        }
        return dp[w] == max?-1: dp[w];
    }
}
