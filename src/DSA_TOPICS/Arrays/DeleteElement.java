package DSA_TOPICS.Arrays;

public class DeleteElement {

    public static int findElement(int[] arr,int n , int key)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }


    public static int deleteElement(int[] arr,int n,int key){

        int position=findElement(arr,n,key);
        if(position==-1)
        {
            System.out.println("Element Not Found : ");
            return n;
        }

        for(int i=position;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        return n-1;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int key=3;

        System.out.println("Before Deletion ");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        n=deleteElement(arr,n,key);

        System.out.println("\n After Deletion");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
