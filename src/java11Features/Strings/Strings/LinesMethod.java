package java11Features.Strings.Strings;

import java.util.stream.Stream;

public class LinesMethod {
    public static void main(String[] args) {
        String str = "This is the first line.\nThis is the second line.\nThis is the third line.";
        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
    }
}
