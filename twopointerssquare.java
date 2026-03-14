import java.util.Arrays;

public class twopointerssquare {
    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        int l=0;
        int r=nums.length-1;
        int[] result = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                result[i] = nums[l] * nums[l];
                l++;
            } else {
                result[i] = nums[r] * nums[r];
                r--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

    

