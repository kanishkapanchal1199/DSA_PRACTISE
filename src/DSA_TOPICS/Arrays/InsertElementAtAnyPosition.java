package DSA_TOPICS.Arrays;

public class InsertElementAtAnyPosition {



    public static void insertElementAtAnyPosition(int [] arr, int n , int key , int position){

        for(int i=n-1;i>=position;i--){
            arr[i+1]=arr[i];
        }
        arr[position]=key;


    }


    public static void main(String[] args) {

        int arr[] = new int[15];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;
        int n = 5;
        int key = 1;
        int position = 2;

        System.out.println("Before Insertion");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        insertElementAtAnyPosition(arr, n, key, position);
        n=n+1;

        System.out.println("\n After Insertion");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
