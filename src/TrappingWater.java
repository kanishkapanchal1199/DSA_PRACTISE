public class TrappingWater {

    public static void main(String[] args) {
        int arr[]= {3, 0, 2, 0, 4};
        int res=trappingWater(arr);
        System.out.println(res);
    }

    public static int trappingWater(int arr[])
    {
        int n=arr.length;
        int res=0;
        for(int i=1;i<n-1;i++)
        {
            int left=arr[i];
            for(int j=0;j<i;j++)
            {
                left=Math.max(left,arr[j]);
            }
            int right=arr[i];
            for(int j=i+1;j<n;j++)
            {
                right=Math.max(right,arr [j]);
            }

            res+=Math.min(left, right)-arr[i];


            //System.out.println(res);

        }
        return res;
    }

}
