public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int i = 0, j = 1, k = 0;
        while (k < n) {
            if (nums[k] < 0) {
                arr[j] = nums[k];
                j += 2;
            } else {
                arr[i] = nums[k];
                i += 2;
            }
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {3, -1, -3, 2, 5, -2};
        Solution sol = new Solution();
        int[] result = sol.rearrangeArray(nums);

        System.out.println("Rearranged array:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
