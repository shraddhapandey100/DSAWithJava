//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) list.add(sc.nextInt());

            Solution obj = new Solution();
            long ans = obj.findMaxProduct(list);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public long findMaxProduct(List<Integer> arr) {
        long mod = 1000000007;
        long product = 1;
        int maxNeg = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        int countNeg = 0;
        int countZero = 0;
        int countPos = 0;

        for (int num : arr) {
            if (num == 0) {
                countZero++;
                continue;
            }
            if (num < 0) {
                countNeg++;
                maxNeg = Math.max(maxNeg, num);
            } else {
                countPos++;
                minPos = Math.min(minPos, num);
            }

            product = (product * num) % mod;
            if (product < 0) product += mod;
        }

        if (arr.size() == 1) {
            return arr.get(0);
        }

        if (countZero == arr.size()) {
            return 0;
        }

        if (countNeg % 2 != 0) {
            if (countNeg == 1 && countZero > 0 && countPos == 0) {
                return 0; // Case when there's only one negative number and the rest are zeros
            }
            product = (product * modInverse(maxNeg, mod)) % mod;
            if (product < 0) product += mod;
        }

        return product;
    }

    private long modInverse(int a, long mod) {
        return power(a, mod - 2, mod);
    }

    private long power(int x, long y, long mod) {
        if (y == 0)
            return 1;
        long p = power(x, y / 2, mod) % mod;
        p = (p * p) % mod;
        
        if (y % 2 == 0)
            return p;
        else
            return (x * p) % mod;
    }
}
 