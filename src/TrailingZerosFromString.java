public class TrailingZerosFromString {
    public static void main(String[] args) {
        String num = removeTrailingZeros("51230100");
        System.out.println(num);
    }

    public static String removeTrailingZeros(String num) {
        char[] arr = num.toCharArray();
        int i = arr.length - 1;
        while (i >= 0 && arr[i] == '0') {
            i--;
        }
        return num.substring(0, i + 1);
        
    }
}
