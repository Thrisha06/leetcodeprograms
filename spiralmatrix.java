public class spiralmatrix {
    static void spiral(int[][] a){

        int top = 0;
        int bottom = a.length - 1;
        int left = 0;
        int right = a[0].length - 1;

        while(top <= bottom && left <= right){

            // LEFT → RIGHT
            for(int i = left; i <= right; i++)
                System.out.println(a[top][i]);
            top++;

            // TOP → BOTTOM
            for(int i = top; i <= bottom; i++)
                System.out.println(a[i][right]);
            right--;

            // RIGHT → LEFT
            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    System.out.println(a[bottom][i]);
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--)
                    System.out.println(a[i][left]);
                left++;
            }
        }
    }
    public static void main(String[] args){

        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        spiral(arr);
    }
}