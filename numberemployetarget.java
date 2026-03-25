public class numberemployetarget {
    public static void main(String[] args) {
        int count=0;
        int hours[]={1,2,3,4,5,6,7,8};
        int target=5;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        System.out.println(count);

    }
}
    

