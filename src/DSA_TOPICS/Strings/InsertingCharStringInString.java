package DSA_TOPICS.Strings;

public class InsertingCharStringInString {

    public static void main(String[] args) {
        String str="kanishka";
        String ch="j";
        int k=2;
        insertCharOrString(str,ch,k);

    }

    public static void insertCharOrString(String str, String ch, int k)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.insert(k,ch);
        String modifiedString= sb.toString();
        System.out.println("Modified String: "+modifiedString);
    }
}
