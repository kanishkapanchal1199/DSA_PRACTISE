public class TotalMoveForBisop {

    public static void main(String[] args) {

        int row=4,col=4;
        System.out.println(solve(row,col));

    }
    public static int solve(int A, int B) {
        int topleft=Math.min(A,B)-1;
        int topright=Math.min(A,9-B)-1;
        int bottomleft=8-Math.max(A,9-B);
        int bottomright=8-Math.max(A,B);

        return topleft+topright+bottomleft+bottomright;
    }
}
