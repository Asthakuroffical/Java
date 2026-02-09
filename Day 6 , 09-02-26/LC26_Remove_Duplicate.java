// Remove Duplicate From Sorted Array 
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int unique = 1;
        int r = 1;
        while(r < nums.length){
            if(nums[r] == nums[r-1]){
                r++; continue;
            }
            nums[l+1] = nums[r];
            l++;
            r++;
            unique++;
        }
        return unique;
    }
}
//  int n = nums.length; 
//         int j = 0;
//         for(int i = 1; i<n; i++){
//             if(nums[j] != nums[i]){
//                 nums[j+1] = nums[i];
//                 j++;
//             }
//         }
        // return j+1;