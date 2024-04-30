package DSA_TOPICS.Arrays;

import java.util.Arrays;

public class SmallestElementFromArray {

    public static void main(String[] args) {
        int arr[]={3,2,2,9,4};

        int Second=Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()->new RuntimeException("Element Not Found"));
        Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()->new RuntimeException("Element Not Found"));
        System.out.println(Second);

    }
}
