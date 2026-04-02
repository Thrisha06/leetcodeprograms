public class min {
    public static void main(String[] args) {

        int[][] mat = {
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0},
            {1, 0, 0}
        };

        int n = mat.length;
        int m = mat[0].length;

        int minOnes = Integer.MAX_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count < minOnes) {
                minOnes = count;
                rowIndex = i;
            }
        }

        System.out.println("Row with minimum 1s: " + (rowIndex + 1));
    }
}