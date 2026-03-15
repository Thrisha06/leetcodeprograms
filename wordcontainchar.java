import java.util.ArrayList;
import java.util.List;

public class wordcontainchar {
    public static void main(String[] args) {
        List<Integer> result=new ArrayList<Integer>();
        String words[]= {"leet", "code"};
        int x = 'e';
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                
                result.add(i);
            }
        }
        System.out.println(result);

    }
}
    

