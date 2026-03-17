public class firstpalindromearray {
    public static void main(String[] args) {

        String arr[] = {"abc", "car", "ada", "racecar"};

        for (String str : arr) {

            int left = 0;
            int right = str.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println(str);
                break;
            }
        }
    }
}
    

        

