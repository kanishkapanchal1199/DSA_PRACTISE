public class ArmstrongNumber {
    //write an number for armstrong number
    public static void main(String[] args) {
        int n=1634;
        int sum=0;
        int temp=n;
        while (n>0)
        {
            int digits=n%10;
            sum=sum+(digits*digits*digits);
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("Armstrong: " + temp);
        }
        else {
            System.out.println("Not Armstrong: " + temp);
        }
    }
}
