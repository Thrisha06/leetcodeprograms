public class shuffle {
    public static void main(String[] args) {
        int nums[]={2,5,4,7,1,9};
        int n=3;
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++]= nums[i];
            result[index++]=nums[i+n];
            
        }
        System.out.println(java.util.Arrays.toString(result));
    }
 }

    

