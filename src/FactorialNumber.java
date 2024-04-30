import java.util.Locale;

public class FactorialNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
//        String ans="anc";
//        ans.toUpperCase();
//        ans.toLowerCase();
//        ans.to

    }
    public  static  int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}
