import java.util.Arrays;

public class plusone {

    public static void main(String[] args) {

        int[] digits = {1,2,9};

        digits = plusOne(digits);

        System.out.println(Arrays.toString(digits));
    }

    static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
