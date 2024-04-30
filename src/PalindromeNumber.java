public class PalindromeNumber {
    //palindrome number
    public static void main(String[] args) {
        int n=121;
        int rev=0;
        int temp=n;
        int arr[]={0,5,0,2,2,0};
        while (n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome: " + temp);
        }
        else {
            System.out.println("Not Palindrome: " + temp);
        }
    }
}
