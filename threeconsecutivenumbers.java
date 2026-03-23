public class threeconsecutivenumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};

        boolean result = checkThreeOdds(arr);
        System.out.println(result);
    }

    public static boolean checkThreeOdds(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   // check odd
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;  // reset if even
            }
        }

        return false;
    }
}