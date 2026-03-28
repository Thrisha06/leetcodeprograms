import java.util.ArrayList;

public class Baseballgame {
    public static void main(String[] args) {

        String[] operation = {"5","2","C","D","+"};
        ArrayList<Integer> scores = new ArrayList<>();
        //added the small comment

        for (String op : operation) {

            if (op.equals("C")) {
                scores.remove(scores.size() - 1);

            } else if (op.equals("D")) {
                scores.add(2 * scores.get(scores.size() - 1));

            } else if (op.equals("+")) {
                int n = scores.size();
                scores.add(scores.get(n - 1) + scores.get(n - 2));

            } else {
                scores.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int s : scores) {
            sum += s;
        }

        System.out.println(sum);
    }
}
