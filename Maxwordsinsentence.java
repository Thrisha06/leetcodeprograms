public class Maxwordsinsentence {
    public static void main(String[] args){
        String[] sent={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max=0;
        for(String s:sent) {
            String[] words=s.split(" ");
            max=Math.max(max,words.length);  
        }
         System.out.println(max);
    }
}
    
    

