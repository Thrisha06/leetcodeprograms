import java.util.*;

public class GameofLife {

    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] dir = {
                {-1,-1},{-1,0},{-1,1},
                {0,-1},{0,1},
                {1,-1},{1,0},{1,1}
        };

        int[][] copy = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                int live = 0;

                for(int[] d:dir){
                    int r = i+d[0];
                    int c = j+d[1];

                    if(r>=0 && r<m && c>=0 && c<n && board[r][c]==1)
                        live++;
                }

                if(board[i][j]==1){
                    if(live==2 || live==3)
                        copy[i][j]=1;
                    else
                        copy[i][j]=0;
                }else{
                    if(live==3)
                        copy[i][j]=1;
                }
            }
        }

        for(int i=0;i<m;i++)
            System.arraycopy(copy[i],0,board[i],0,n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();

        int[][] board=new int[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                board[i][j]=sc.nextInt();

        gameOfLife(board);

        for(int[] row:board){
            for(int x:row)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
    

