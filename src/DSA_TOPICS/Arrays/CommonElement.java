package DSA_TOPICS.Arrays;

import java.util.Arrays;

public class CommonElement {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,3,7,7,2};

        Arrays.stream(arr1).filter(i->Arrays.stream(arr2).anyMatch(j->i==j)).forEach(System.out::println);

    }

}

