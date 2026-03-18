public class digitgame {
    public static void  main(String[] args){
        int arr[]={2,3,4,5,7,12,65};
        int singlesum=0;
        int doublesum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1 && arr[i]<=9){
                singlesum += arr[i];
            }else if(arr[i]>=10 && arr[i]<=99){
                doublesum += arr[i];
            }
        }
        if(singlesum > doublesum || doublesum<singlesum){
            System.out.println("true");
           
        }else{
           System.out.println("false");
        }
    }
    
}
