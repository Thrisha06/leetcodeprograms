public class spiralmatrix {
    static void spiral(int[][] a){
        int top = 0;
        int down = a.length-1;
        int left = 0;
        int right = a[0].length-1;

        while(top<=down && left<=right){
            for(int i=left;i<=right;i++)
                System.out.println(a[top][i]+" ");
            top++;
            for(int i=top;i<=down;i++)
                System.out.println(a[i][right]+" ");
            right--;
            if(top<=down){
                for(int i=right;i>=left;i--)
                    System.out.println(a[down][i]+" ");
                down--;
            }
            if(left<=right){
                for(int i=down;i>=top;i--)
                    System.out.println(a[i][left]+" ");
                left--;

            }
        }

    }

    public static void main(String[] args) {
        int[][] arr   = {{1,2,3}, {4,5,6},{7,8,9} };
        spiral(arr);
    }
}

