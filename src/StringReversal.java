public class StringReversal {
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "kanishka";
        System.out.println(reverseString(original));
    }
}
