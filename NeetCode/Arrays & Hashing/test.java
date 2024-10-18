import java.math.BigInteger;

public class Test {

    static final int MOD = 1000000007;

    // Function to calculate nCr (combinations) % MOD
    public static long combination(int n, int r) {
        if (r > n) return 0;
        
        // Calculate n! / (r! * (n-r)!)
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;
        
        // n! part
        for (int i = 0; i < r; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(n - i));
            denominator = denominator.multiply(BigInteger.valueOf(i + 1));
        }

        // Perform division and modulo MOD
        BigInteger result = numerator.divide(denominator).mod(BigInteger.valueOf(MOD));
        return result.longValue();
    }

    public static int getNumWays(String src, String target, int k) {
        int n = src.length();
        
        // If the lengths don't match, return 0
        if (n != target.length()) {
            return 0;
        }
        
        // Find the index in target where the first character of src matches
        int targetIndex = -1;
        for (int i = 0; i < n; i++) {
            if (target.charAt(i) == src.charAt(0)) {
                targetIndex = i;
                break;
            }
        }
        
        // If no match found, return 0
        if (targetIndex == -1) {
            return 0;
        }
        
        // Calculate the distance from the start of src to target's index
        int distance = targetIndex;
        
        // Apply the formula n + k - 1 choose n
        return (int) combination(distance + k - 1, distance);
    }

    pubic static void main(String[] args) {
        Test x = new Test();
        x.getNumWays("ababab", "ababab", 1);
    }
}
    


