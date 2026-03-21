public class Elementsumdifference {
    public static void main(String[] args) {
        int nums[] = {1, 12, 3, 4, 5};
        int sum = 0;
        int digitsum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int temp = nums[i];  // take each number
            while (temp > 0) {
                digitsum += temp % 10;
                temp /= 10;
            }
        }

        int result = Math.abs(sum - digitsum);
        System.out.println(result);
    }
}
