import java.util.HashSet;

public class Happynumbers {
    public static void main(String[] args) {
        int n = 19;
        if (isHappy(n))
            System.out.println("Happy number");
        else
            System.out.println("Not happy number");
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

