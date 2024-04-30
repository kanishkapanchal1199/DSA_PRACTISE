package DSA_TOPICS.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(arr,n)));


    }
    public static int[] shuffle(int[] nums, int n) {

        int[] ans=new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++)
        {
            ans[k]=nums[i];
            ans[k+1]=nums[i+n];
            k=k+2;
        }
        return ans;
    }
}
