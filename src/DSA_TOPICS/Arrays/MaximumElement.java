package DSA_TOPICS.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int arr[]={100,2,23,43,6};
        int max=max(arr);
        System.out.println("Maximum Element: "+max);

        int maxRange=maxRange(arr,2,4);

        System.out.println("Maximum Range: "+maxRange);
    }
    public static int max(int arr[]){

        if(arr.length==0)
        {
            return -1;
        }

        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static int maxRange(int arr[],int start, int end)
    {
        if(end>start)
        {
            return -1;
        }
        if(arr.length==0)
        {
            return -1;
        }
        int max=arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

}
