//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static int getMaxArea(int arr[]) {
        int n = arr.length;
        if(n == 1) return arr[0];
        
        int res = 0;
        Stack<Pair> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            while(!st.isEmpty() && st.peek().a >= num) {
                Pair p = st.pop();
                cnt += p.b;
                res = Math.max(res, p.a * cnt);
            }
            st.push(new Pair(num, cnt + 1));
        }

        int cnt = 0;
        while(!st.isEmpty()) {
            Pair p = st.pop();
            cnt += p.b;
            res = Math.max(res, p.a * cnt);
        }
        
        return res;
    }
    
    static class Pair {
        int a;
        int b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.getMaxArea(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends