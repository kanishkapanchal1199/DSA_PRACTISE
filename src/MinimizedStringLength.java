import java.util.HashMap;
import java.util.Map;

public class MinimizedStringLength {

    public static void main(String[] args) {
        String s="dddaaa";
        int len=minimizedStringLength(s);
        System.out.println("Minimized String Length : "+len);
    }

    public static int minimizedStringLength(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
                count++;
            }
        }




        return arr.length-count;

    }
}
