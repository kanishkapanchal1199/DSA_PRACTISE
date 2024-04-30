package DSA_TOPICS.Arrays;

import java.util.Scanner;

public class TwoDMatrix {

    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the row number");

        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }

        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
