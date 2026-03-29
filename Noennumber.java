public class Noennumber {
    public static void main(String[] args){
        int num=9;
        int square=num*num;
        int sum=0;
        while(square>0){
            int digit=square%10;
             sum+=digit;
             square/=10;
        }
        if(sum==num)
            System.out.println("neon number");
        else
            System.out.println("not neon number");
    }
    
}
