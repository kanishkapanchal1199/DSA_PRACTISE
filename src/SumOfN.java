public class SumOfN {
    public static void main(String[] args) {
        System.out.println("Sum Of N:"+sumOfN(3));
        System.out.println("Power of :"+powerOfN(2,3));
    }
    public static int sumOfN(int n){
        if(n==0)
            return 0;
        return n+sumOfN(n-1);
    }
    public static int powerOfN(int n,int p){
        if(p==0)
            return 1;
        return n*powerOfN(n,p-1);
    }
}
