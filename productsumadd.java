public class productsumadd {
    public static void main(String[] args){
        int n=254;
        int product =1;
        var sum=0;
        while(n>0){
            int digit=n%10;
            product *= digit;
            sum += digit;
            n/=10;
        }
        System.out.println(product-sum);
    }
    
}
