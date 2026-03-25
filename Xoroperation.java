public class Xoroperation {
    public static void main(String[] args){
        int n=5;
        int start=0;
        int result=0;
        for (int i = 0; i < n; i++) {
           result ^= (start + 2*i);
            
        }
        System.out.println(result);
    }
}
    

