import java.util.ArrayList;

public class ReverseStringOfWords {

    public static String solve(String A) {
        String[] arr = A.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]).append(" ");
        }

        return res.toString().trim();



    }

    public static void main(String[] args) {
        String rev=solve("the sky is blue");
        System.out.println(rev);

    }
}
