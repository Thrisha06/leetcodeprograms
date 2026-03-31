public class rotatestring {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        if (s.length() != goal.length()) {
            System.out.println(false);
            return;
        }

        String doubled = s + s;

        boolean result = doubled.contains(goal);

        System.out.println(result);
    }
}
    
