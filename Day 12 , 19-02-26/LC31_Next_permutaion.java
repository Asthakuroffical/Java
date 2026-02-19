class Solution {
    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n  = nums.length;
        // step 1 to find the pivot 
        int pivot = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1] ){
                pivot = i;
                break;
            }
        } 
        // Base Case if Array is sorted [5 , 4, 3, 2, 1] in that case no pivot found just reverse the array 
        if(pivot == -1){
            int j =0;
            int k = n-1;
            while(j < k){
                swap(nums, j , k);
                j++;
                k--;
            }
            return;
        }
        // step 2 now find the Right Most Element
        for(int i = n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
              swap(nums , pivot , i);
              break;
            }
        }
        // Step 3 Now Reverse the Array which start from pivot +1 to n-1;
        int i = pivot+1;
        int j = n-1;
        while(i < j){
          swap(nums , i , j);
          i++;
          j--;
        }
    }
}