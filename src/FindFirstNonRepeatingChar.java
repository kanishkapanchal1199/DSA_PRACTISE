import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        Character c=findFirstNonRepeatingChar("kanishka");
        System.out.println(c);
    }
    public static Character findFirstNonRepeatingChar(String str){
        char[] chars=str.toCharArray();
        //Arrays.sort(chars);
        System.out.println(chars);
        //con
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<chars.length;i++){
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }
            else{
                map.put(chars[i],map.get(chars[i])+1);
            }

        }
        return  map.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
//        for(int i=0;i<chars.length;i++){
//            if(map.get(chars[i])==1){
//                return chars[i];
//            }
//        }
//        return null;
    }
}
