//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSingle(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count frequency of each element
        for (int it : arr) {
            mp.put(it, mp.getOrDefault(it, 0) + 1);
        }

        // Return the element that appears only once
        for (var it : mp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return 0;
    }
}