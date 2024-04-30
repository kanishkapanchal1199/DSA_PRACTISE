public class PrintDivison {
    //PrintDivison for the number

    public static void main(String[] args) {
        int n=48;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Divisor: "+i);
            }
        }
    }
}
