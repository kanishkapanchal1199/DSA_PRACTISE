package DSA_TOPICS.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayFromInteger {

    public static void main(String[] args) {
        ArrayFromInteger solution = new ArrayFromInteger();

        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;
        System.out.println(solution.addToArrayForm(num1, k1)); // Output: [1, 2, 3, 4]

        int[] num2 = {2, 7, 4};
        int k2 = 181;
        System.out.println(solution.addToArrayForm(num2, k2)); // Output: [4, 5, 5]

        int[] num3 = {2, 1, 5};
        int k3 = 806;
        System.out.println(solution.addToArrayForm(num3, k3)); // Output: [1, 0, 2, 1]
    }

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i=num.length-1;i>=0;--i)
        {
            list.add(0,(num[i]+k)%10);
            k=(num[i]+k)/10;
        }
        while(k>0)
        {
            list.add(0,k%10);
            k/=10;

        }
        return list;
    }

}
