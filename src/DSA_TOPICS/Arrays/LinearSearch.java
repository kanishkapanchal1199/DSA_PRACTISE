package DSA_TOPICS.Arrays;

public class LinearSearch {

    public static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=8;
        if(linearSearch(arr,key)==-1)
        {
            System.out.println("Element Not Found");
        }
        else
        {
            System.out.println("Element Found");
        }
    }

}
