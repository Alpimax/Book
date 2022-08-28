package CodingBat;

import java.util.Arrays;

public class CodingBat {
    public static void main(String[] args) {
    int[] nums ={2,4,11,3};


        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int count = 0;
        String str = String.valueOf(count);
        int [] number = new int[2];
        for(int each : nums)  {
            for(int i = 0 ; i<nums.length ;i++){
                if (count != i) {
                    if ((each + nums[i]) == target) {
                        number[0] = count;
                        number[1] = i;
                        return number;
                    }
                }
            }
            count++;
        }
        return number;
    }
}
