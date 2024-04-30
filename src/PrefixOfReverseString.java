public class PrefixOfReverseString {

    public static void main(String[] args) {
       String reversePrefix = reversePrefix("abcd", 'z');
        System.out.println(reversePrefix);
    }

    public static String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch) {
                StringBuilder prefix=new StringBuilder(word.substring(0, i+1));
                return prefix.reverse()+word.substring(i+1);
            }
        }
        return word;


    }
}
