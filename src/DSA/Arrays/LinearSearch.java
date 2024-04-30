package DSA.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] ={2,5,6,1,8,10};
        int key=3;
        int position=linearSearch(arr,key);
        if(position==-1)
        {
            System.out.println("Element Not Found ");

        }
            else {
            System.out.println("Element Found : " + (position+1) );
        }


    }
    public static int linearSearch(int[] arr,int key){

        for(int i=0;i<arr.length;i++)
            if(arr[i]==key)
                return i;

            return -1;

        }

}
