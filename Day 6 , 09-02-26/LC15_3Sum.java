class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Make a dynamic arraylist 
        List<List<Integer>> list = new ArrayList<>();
        // step 2 sorting 
        Arrays.sort(nums);
        // step 3 iterate over the array 
        for(int i = 0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.leangth-1;
            while( j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                  list.add(Arrays.asList(nums[i], nums[j] , nums[k]));
                  j++;
                  k--;
                  while(j < k && nums[j] == nums[j-1]) j++;
                }
            }
        }
       return list;
    }
}