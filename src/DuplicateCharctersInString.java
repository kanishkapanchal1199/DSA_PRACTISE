import java.util.HashMap;

public class DuplicateCharctersInString {
    public static void main(String[] args) {

        duplicateCharcter("kanishka");

    }
    public static void duplicateCharcter(String str){
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }
            else{
                map.put(ch[i],map.get(ch[i])+1);
            }

        }
        System.out.println(map);


    }
}
