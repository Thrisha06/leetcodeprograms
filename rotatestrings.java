public class rotatestrings {
    static void rotatestring(String s){
        int mid=s.length()/2;

        String first = s.substring(0,mid);
        String second = s.substring(mid);

        String result = second + first;
        System.out.println(result + result);

    }
    public static void main(String[] args) {
        rotatestring("abcd");
    }
}
