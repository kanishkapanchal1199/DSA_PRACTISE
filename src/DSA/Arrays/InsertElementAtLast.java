package DSA.Arrays;

public class InsertElementAtLast {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i, key = 26;

        System.out.print("Before Elements:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        n=insertElement(arr,n,key,capacity);
        System.out.print("After Elements : ");
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }
    public static int insertElement(int arr[] , int n , int key , int capacity)
    {
        if(n>=capacity)
            return n;
        arr[n] = key;
        return n+1;

    }
}
