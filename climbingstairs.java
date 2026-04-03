public class climbingstairs {
    public static int main(String[] args) {
         int n=5;
        if(n <= 2)
            return n;

        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
    

