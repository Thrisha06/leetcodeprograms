public class countcharacters {
     public static void main(String[] args) {
        String s = "aAbBcC";
        System.out.println(countKeyChanges(s));
    }

    public static int countKeyChanges(String s) {
        s = s.toLowerCase();  // normalize case
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;
            }
        }

        return count;
    }
}
    

