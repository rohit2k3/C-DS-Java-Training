package JavaPrograms.Array;

import java.util.Arrays;

public class GreatestSmallest {
    public static void main(String[] args) {
        int nos[] = {1,7,3,11,24,9};
        System.out.println(Arrays.toString(LargestSmallest(nos)));

    }
    public static int[] LargestSmallest(int[] arr){
        int[] ans = new int[2];
        ans[0] = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans[0]){
                ans[0] = arr[i];
            }
            if (arr[i] > ans[1]){
                ans[1] = arr[i];
            }
        }
        return ans;
    }
}
