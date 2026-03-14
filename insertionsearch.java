

public class insertionsearch{
    public static void main(String[] args) {
        
        int arr[]={1,3,5,7};
        int tar=1;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==tar){
                System.out.println(arr[mid]);
                return;
            }else if(tar<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
            
        }
        System.out.println(l);
    }
}
