import java.util.HashMap;
import java.util.Locale;

public class DuplicateWordInString {
    public static void main(String[] args) {
    duplicateWordsInString("Java is a programming language and Java is also a platform");
    }
    public static void duplicateWordsInString(String str){
        String[] splitStr=str.toLowerCase().split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<splitStr.length;i++){
            if(!map.containsKey(splitStr[i])){
                map.put(splitStr[i],1);
            }
            else {
                map.put(splitStr[i], map.getOrDefault(splitStr[i], 0) + 1);
            }
        }
        System.out.println(map);


    }
}
