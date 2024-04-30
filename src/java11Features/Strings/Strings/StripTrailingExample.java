package java11Features.Strings.Strings;

public class StripTrailingExample {
    public static void main(String[] args) {
        String str = "Hello, World!     ";
        String strippedStr = str.stripTrailing();
        System.out.println("Original string: " + str);
        System.out.println("Stripped string: " + strippedStr);
    }
}
