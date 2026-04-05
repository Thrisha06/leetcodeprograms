public class Robertjourney {
    static void robertjourney(int rows, int cols){
        int path = factorial(rows+cols -2)/((factorial(rows-1)*factorial(cols-1)));

         System.out.println(path);
    }
    static int factorial(int n){
        int fact =1;
        for(int i=1;i<n;i++)
            fact*=i;
        return fact;
    }
    public static void main(String[] args) {
        robertjourney(3,3);
    }
    
}
