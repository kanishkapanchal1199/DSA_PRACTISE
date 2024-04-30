package DSA_TOPICS.Arrays;

import java.util.Arrays;

public class LongestStringFromArray {
    public static void main(String[] args) {
        String[] arr={"apple","bananana","grapes","avacado"};

        Arrays.stream(arr).mapToInt(i->i.length()).max().ifPresent(System.out::println);
    }
}
