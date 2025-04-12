//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            int[][] image = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S2 = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) image[i][j] = Integer.parseInt(S2[j]);
            }
            int sr = Integer.parseInt(br.readLine().trim());
            int sc = Integer.parseInt(br.readLine().trim());
            int newColor = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int originalColor = image[sr][sc];
        if(originalColor == newColor)return image;
        dfs(image, sr, sc, originalColor, newColor);
        return image;
    }
    //Helper function for DFS.
    private void dfs(int[][] image, int row, int col, int originalColor, int newColor){
        if(row < 0 || row >= image.length || col <0 || col>= image[0].length){
            return;
        }
        //If the current pixel is not of the original color, return.
        if(image[row][col] != originalColor)return;
        image[row][col] = newColor;
        dfs(image, row+1, col, originalColor, newColor);
        dfs(image, row-1, col, originalColor, newColor);
        dfs(image, row, col +1, originalColor, newColor);
        dfs(image, row, col -1, originalColor, newColor);
        
    }
}