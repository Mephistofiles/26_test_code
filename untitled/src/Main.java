import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));

    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 1;
        int z = 0;
        int i =1;
        while (x!=nums.length) {
            if (nums[z]==nums[x]) {
                x++;
                z++;

            } else {
                nums[i] = nums[x];
                i++;
                x++;
                z++;

            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}