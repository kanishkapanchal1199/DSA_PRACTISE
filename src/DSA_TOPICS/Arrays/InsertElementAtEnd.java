package DSA_TOPICS.Arrays;

public class InsertElementAtEnd {

    public static int insertElementAtEnd(int[] arr, int n, int key, int capacity) {

        if (n >= capacity) {
            return n;
        }
        arr[n]=key;

        return (n+1);

    }

    public static void main(String[] args) {
        int [] arr= new int[20];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        arr[5]=7;

        int capacity=20;
        int n=7;
        int key=8;

        System.out.println("Before Insertion");
        System.out.println("------------------------");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        n=insertElementAtEnd(arr,n,key,capacity);

        System.out.println("\n After Insertion");
        System.out.println("------------------------");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
