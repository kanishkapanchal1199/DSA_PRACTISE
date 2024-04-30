public class ReverseNumber {
   // Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

    //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    public static void main(String[] args) {
            int rev=reverse(-123);
        System.out.println("Reverse: "+rev);
    }
    public static int reverse(int x) {
        int rev=0;

        while (x!=0)
        {
            if(Math.abs(rev)> Integer.MAX_VALUE/10)
                return 0;

            rev=rev*10+x%10;
            x=x/10;
        }
        return x<0? -rev: rev;
    }
}
