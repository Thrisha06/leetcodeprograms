public class validanagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        if(isanagram(s,t))
            System.out.println("valid anagram");
        else
            System.out.println("not valid anagram");
        
    }
    
      private static boolean isanagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c != 0)
                return false;
        }
        return true;
    }
}
   
        
    

