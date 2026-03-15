
public class signofproduct{
    public static void main(String[] args){
        int nums[]={-1,-2,-3,-4,3,2,1};
        int product =1;
        for(int i=0;i<nums.length;i++){
            product *= nums[i];
           

        }
         System.out.println(signFunc(product));
         
    }
     public static int signFunc(int x){
        if(x > 0) return 1;
        else if(x < 0) return -1;
        else return 0;
    }
}   
