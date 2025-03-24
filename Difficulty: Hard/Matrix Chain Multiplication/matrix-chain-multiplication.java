//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().matrixMultiplication(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    static int matrixMultiplication(int arr[]) {
        int N = arr.length; // Correctly defining N
        int dp[][] = new int[N][N]; // Correct size of DP array
        
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return mcm(arr, 1, N - 1, dp);
    }

    private static int mcm(int[] arr, int i, int j, int dp[][]) {
        if (i >= j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) { // Corrected loop condition
            int c1 = mcm(arr, i, k, dp);
            int c2 = mcm(arr, k + 1, j, dp);
            int c3 = arr[i - 1] * arr[k] * arr[j];

            ans = Math.min(ans, c1 + c2 + c3);
        }
        dp[i][j] = ans;
        return ans;
    }
}
