public class robortreturns {
    
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'R') x++;
            else if (move == 'L') x--;
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String moves = "UD";  // test input
        boolean result = judgeCircle(moves);
        System.out.println(result);
    }
}
    

