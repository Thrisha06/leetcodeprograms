import java.util.Arrays;

public class Minimumnumbers {
    public static void main(String[] args) {
        int[] nums = {3,1,4,2,5};
        Arrays.sort(nums);

        int[] arr = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            arr[index++] = nums[i + 1]; 
            arr[index++] = nums[i];
        }

        // If odd element remains, add it
        if (nums.length % 2 != 0) {
            arr[index] = nums[nums.length - 1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
    

