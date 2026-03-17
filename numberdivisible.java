public class numberdivisible {
    public static void main(String[] args) {
        int n=121;
        int count=0;
        for(int i=0;i<=n;i++){
            if(i%3==0 || i%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
    


            
    

