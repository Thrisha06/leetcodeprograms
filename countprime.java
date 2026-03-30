public class countprime {

    public static void main(String[] args) {

        int n = 10;

        Solution obj = new Solution();
        int result = obj.countPrimes(n);

        System.out.println("Number of primes = " + result);
    }
}

class Solution {

    public int countPrimes(int n) {

        if (n <= 2)
            return 0;

        boolean[] prime = new boolean[n];

        for (int i = 2; i < n; i++)
            prime[i] = true;

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i)
                    prime[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i])
                count++;
        }

        return count;
    }
}