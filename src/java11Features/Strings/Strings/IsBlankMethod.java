package java11Features.Strings.Strings;

public class IsBlankMethod {

    public static void main(String[] args) {
        // empty string
        String str1 = "";
        // string containing only whitespace characters
        String str2 = "  \t \n";
        // non-blank string
        String str3 = "Hello";
        boolean isStr1Blank = str1.isBlank();    // true
        boolean isStr2Blank = str2.isBlank();    // true
        boolean isStr3Blank = str3.isBlank();    // false
        System.out.println("First result: str1: "+ isStr1Blank);
        System.out.println("Second result: str2: "+ isStr2Blank);
        System.out.println("Third result: str3: "+ isStr3Blank);
    }
}
