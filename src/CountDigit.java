public class CountDigit {
    //find the number of digits of n that evenly divides n
    public static void main(String[] args) {
        int n=35;
        int count=0;
        int ans=n;
        while(n>0){
            int digits=n%10;
            if(digits>0 && ans%digits==0){
                count++;
            }
            n/=10;

        }
        System.out.println("Count of digits: "+count);
    }
}
