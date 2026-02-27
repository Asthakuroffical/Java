class Solution {
    public int[] rearrangeArray(int[] nums) {
    // just make new arr 
    int arr[] = new int[nums.length];
    int f = 0;//even 0 , 2, 4
    int j = 1; // odd 1 , 3, 4
    for(int i = 0; i<nums.length; i++){
        if(nums[i] > 0){
            arr[f] = nums[i];
            f += 2;
        }else{
            arr[j] = nums[i];
            j += 2;
        }
    }
    return arr;
    }
}